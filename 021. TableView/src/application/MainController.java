package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable
{
	
	@FXML private TableView<Student> table;
	@FXML private TableColumn<Student, Integer> id;
	@FXML private TableColumn<Student, String> name;
	@FXML private TableColumn<Student, String> surname;
	@FXML private TableColumn<Student, Integer> age;
	
	public ObservableList<Student> list = FXCollections.observableArrayList
	(
		new Student(1, "Mark", "surname1", 22),
		new Student(2, "tom", "surname2", 30),
		new Student(3, "ben", "surname3", 15),
		new Student(4, "john", "surname4", 65),
		new Student(5, "tomy", "surname5", 44)	
	);
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		
		table.setItems(list);
		// TODO Auto-generated method stub
		
	}

}
