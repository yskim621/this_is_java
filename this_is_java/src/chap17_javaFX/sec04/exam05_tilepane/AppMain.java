package chap17_javaFX.sec04.exam05_tilepane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	// UI 부분은 fxml 파일로 대체
	public void start(Stage primaryStage) throws Exception  {
		Parent parent = (Parent)FXMLLoader.load(getClass().getResource("Root.fxml"));
		Scene scene = new Scene(parent);
			
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}
	
	
}

