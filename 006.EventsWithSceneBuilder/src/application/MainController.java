package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;
public class MainController
{
	@FXML //to pomaga znajdowanie rzeczy w scene builderze
	private Label myMessage; 
	
	public void generateRandom(ActionEvent event)  //uwaga to musi byc javafx Actionevent
	{
		Random rand =  new Random();
		int myrand = rand.nextInt(50)+1;
		myMessage.setText(Integer.toString(myrand));
		//System.out.println(Integer.toString(myrand));
	}
}
