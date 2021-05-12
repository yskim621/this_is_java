package chap17_javaFX.sec04.exam02_hbox_vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	// UI 부분은 fxml 파일로 대체
	public void start(Stage primaryStage) throws Exception  {
		VBox root = (VBox)FXMLLoader.load(getClass().getResource("Root.fxml"));
		Scene scene = new Scene(root);
			
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);			
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	
		
	}
	
	
}

