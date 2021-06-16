package chap17_javaFX.sec11.exam03_task_callback;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Label lblResult;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private Task<Integer> task;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event->handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}
	
	public void handleBtnStart(ActionEvent e) {
		task = new Task<Integer>() {

			@Override
			protected Integer call() throws Exception {
				int result = 0;
				for(int i=0; i<=100; i++) {
					if(isCancelled()) {
						updateMessage("취소됨");
						break;
					}
					result += i;
					updateProgress(i, 100);
					updateMessage(String.valueOf(i));
					try {
						Thread.sleep(100);
						
					} catch(InterruptedException e) {
						if(isCancelled()) {
							updateMessage("취소됨");
							break;
						}
					}
				}
				return result;
			}
			
			@Override
			protected void succeeded() {
				lblResult.setText(String.valueOf(task.getValue()));
			}
			
			@Override
			protected void cancelled() {
				lblResult.setText("취소됨");
			}
			
			@Override
			protected void failed() {
				lblResult.setText("실패");
			}
		};
		
		progressBar.progressProperty().bind(task.progressProperty());
		lblWorkDone.textProperty().bind(task.messageProperty());
		lblResult.setText("");
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
}
