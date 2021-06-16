package chap17_javaFX.sec11.exam04_service;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Service;
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
	
	private TimeService timeService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event->handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}
	
	public void handleBtnStart(ActionEvent e) {
		
	}
	
	public void handleBtnStop(ActionEvent e) {
		
	}
	
	class TimeService extends Service<Integer> {

		@Override
		protected Task<Integer> createTask() {
			Task<Integer> task = new Task<Integer>() {

				@Override
				protected Integer call() throws Exception {
					int result = 0;
					for(int i=0; i<=100; i++) {
						if(isCancelled()) break;
						result += i;
						updateProgress(i, 100);
						updateMessage(String.valueOf(i));
						try {
						Thread.sleep(100);
						} catch(InterruptedException e) {
							if(isCancelled()) break;
						}
					}
					return null;
				}
				
			};
			return task;
		}
		
	}
}
