package chap17_javaFX.sec09.exam01_dialog;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class RootController implements Initializable {
	//@FXML private HBox hbox;
	
	
	private Stage primaryStage;
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
	}
	
	public void handleOpenFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("Text Files", "*.txt"),
			new ExtensionFilter("Image Files", "*.png,", "*.jpg", "*.gif", "*.jpeg"),
			new ExtensionFilter("Audio Files", "*.wav", "*.mp4", "*.mp3"),
			new ExtensionFilter("All Files", "*.*")
		);
		//File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	
	public void handleSaveFileChooser(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.*"));
		
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	
	public void handleDirectoryChooser(ActionEvent e) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDir = directoryChooser.showDialog(primaryStage);
		
		if(selectedDir != null) {
			System.out.println(selectedDir.getPath());
		}
	}
	
	public void handlePopup(ActionEvent e) {
		
	}
	
	public void handleCustom(ActionEvent e) {
		
	}
}
