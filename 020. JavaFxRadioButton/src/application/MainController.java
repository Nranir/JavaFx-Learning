package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;


public class MainController 
{
	@FXML private RadioButton rb1; //male
	@FXML private RadioButton rb2; //female
	@FXML private Label lbl1;
	
	public void radioSelect()
	{
		String message = "";
		if(rb1.isSelected())
		{
			message=rb1.getText() + "\n";
		}
		if(rb2.isSelected())
		{
			message=rb2.getText()+ "\n";
		}
		lbl1.setText(message);
		
	}
	

}
