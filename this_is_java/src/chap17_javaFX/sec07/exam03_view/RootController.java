package chap17_javaFX.sec07.exam03_view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RootController implements Initializable {
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(FXCollections.observableArrayList(
			"갤럭시S1","갤럭시S2","갤럭시S3","갤럭시S4","갤럭시S5","갤럭시S6","갤럭시S7" 
		));
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
			}
			
		});
		
		ObservableList phoneList = FXCollections.observableArrayList(
				new Phone("갤럭시S1", "phone01.png"),
				new Phone("갤럭시S2", "phone02.png"),
				new Phone("갤럭시S3", "phone03.png"),
				new Phone("갤럭시S4", "phone04.png"),
				new Phone("갤럭시S5", "phone05.png"),
				new Phone("갤럭시S6", "phone06.png"),
				new Phone("갤럭시S7", "phone07.png")
		);
		
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER;");
		
		tableView.setItems(phoneList);
	}
	
	public void handleBtnOkAction(ActionEvent e) {

	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}

}
