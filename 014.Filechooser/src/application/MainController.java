package application;

import java.io.File;
import java.util.Collection;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController 
{
	@FXML
	private Button btn1 = new Button();
	@FXML
	private Button btn2 = new Button();
	@FXML
	private ListView listview = new ListView<>();
	
	public void Button1Action(ActionEvent event)
	{
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File ("E:\\Users\\Marcin\\Moje Dokumenty"));
		
		fc.getExtensionFilters().addAll(
		new ExtensionFilter("PDF FILES", "*pdf")
		);
		
		File selectedFile = fc.showOpenDialog(null);

		
		if(selectedFile != null )
		{
			listview.getItems().add(selectedFile.getName());
		}
		else
		{
			System.out.println("file is not valid");
		}
	}
	
	public void Button2Action(ActionEvent event)
	{
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File ("E:\\Users\\Marcin\\Moje Dokumenty"));
		fc.getExtensionFilters().addAll(
		new ExtensionFilter("PDF FILES", "*pdf")
		);
		
		List<File> selectedFiles = fc.showOpenMultipleDialog(null);
		

		
		
		if(!selectedFiles.isEmpty())
		{
			for(File item : selectedFiles)
			{
				if(item !=null)
				{
					listview.getItems().add(item.getName());
				}
				else
				{
					System.out.println("One of the files is not valid:" + item.getName());
				}
			}
		}

	}
	
}
