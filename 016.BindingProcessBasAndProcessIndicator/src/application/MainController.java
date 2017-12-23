package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController implements Initializable
{
	final MyNumber myNum = new MyNumber();
	
	@FXML 
	private Label lblStatus;
	@FXML
	Button btn1 = new Button();
	
	@FXML
	Button btn2 = new Button();
	
	@FXML
	private ProgressBar pb;
	@FXML
	private ProgressIndicator pi;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		// TODO Auto-generated method stub
		myNum.setNumber(0.0);
		pb.progressProperty().bind(myNum.numberProperty());
		pi.progressProperty().bind(myNum.numberProperty());
		
		
		myNum.numberProperty().addListener(new ChangeListener<Object>()
		{

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2)
			{
				// TODO Auto-generated method stub
				//lblStatus.setText(new Double(myNum.getNumber()).toString());
				lblStatus.setText(String.valueOf(myNum.getNumber()));
			}
			
		});
		
	}
	
	public void btnClick(ActionEvent event)
	{
		//dodawanie double jest mocno nie prezyzyjne dlatego zrobienie dodawania/odejmowania na pelnych liczbach jest bardziej precyzyjne
			
		myNum.setNumber(((myNum.getNumber()*10)+1)/10); 
	}
	public void btn2Click(ActionEvent event)
	{
		myNum.setNumber(((myNum.getNumber()*10)-1.0)/10);
	}

}
