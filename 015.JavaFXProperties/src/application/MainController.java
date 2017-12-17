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

public class MainController implements Initializable
{
	final MyNumber myNum = new MyNumber();
	
	@FXML 
	private Label lblStatus;
	@FXML
	Button btn1 = new Button();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		// TODO Auto-generated method stub
		myNum.setNumber(0);
		myNum.numberProperty().addListener(new ChangeListener<Object>()
		{

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2)
			{
				// TODO Auto-generated method stub
				lblStatus.setText(new Double(myNum.getNumber()).toString());
			}
			
		});
		
	}
	
	public void btnClick(ActionEvent event)
	{
		myNum.setNumber(myNum.getNumber()+1);
	}

}
