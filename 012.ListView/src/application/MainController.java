package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class MainController implements Initializable{
	
	@FXML
	public Label myLabel;
	
	@FXML
	public ComboBox<String> combobox;
	
	@FXML
	public TextField txtName;
	
	@FXML
	public ListView<String> listview;
	
	
	ObservableList<String> list = FXCollections.observableArrayList("Mark","Tom", "John", "Jack" );
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		//combobox.setItems(list);
		//listview.setItems(list);
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void comboChanged(ActionEvent event)
	{
		myLabel.setText(combobox.getValue());
		//combobox.getItems().addAll("Ram","Ben", "Steve", "ma");
	}
	
	public void buttonaction(ActionEvent event)
	{
		combobox.getItems().add(txtName.getText());
		listview.getItems().add(txtName.getText());
		
		if(txtName.getText().equals(""))
		{
			ObservableList<String> names;
			names = listview.getSelectionModel().getSelectedItems();
			String temp="";
			for(String name : names)
			{
				temp+=name+" ";
				
			}
			myLabel.setText(temp);
		}
		//combobox.getItems().addAll("Ram","Ben", "Steve", "ma");
	}
	
	

}
