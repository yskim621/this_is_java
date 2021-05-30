package chap17_javaFX.sec07.exam03_view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class RootController implements Initializable {
	@FXML private ListView listView;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(FXCollections.observableArrayList(
			"갤럭시S1","갤럭시S2","갤럭시S3","갤럭시S4","갤럭시S5","갤럭시S6","갤럭시S7" 
		));
	}
	
	public void handleBtnOkAction(ActionEvent e) {

	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}

}
