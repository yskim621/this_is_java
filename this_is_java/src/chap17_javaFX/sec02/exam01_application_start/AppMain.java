package chap17_javaFX.sec02.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
