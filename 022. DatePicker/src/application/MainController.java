package application;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController 
{
	
	@FXML private DatePicker dp;
	@FXML private Label showdatelbl;
	
	public void ShowDate()
	{
		LocalDate ld = dp.getValue();
		showdatelbl.setText(String.valueOf(ld));
	}
}
