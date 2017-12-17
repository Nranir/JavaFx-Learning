package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable
{
	
	@FXML
	TreeView<String> treeview;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/icon-folder-128.png"));

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		// TODO Auto-generated method stub
		icon.widthProperty();
		
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		root.setExpanded(true);
		
		TreeItem<String> nodeA = new TreeItem<>("nodeA", new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<>("nodeB", new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<>("nodeC", new ImageView(icon));
		
		
		TreeItem<String> nodeA1 = new TreeItem<>("nodeA1", new ImageView(icon));
		TreeItem<String> nodeA2 = new TreeItem<>("nodeA2", new ImageView(icon));
		TreeItem<String> nodeA3 = new TreeItem<>("nodeA3", new ImageView(icon));
		nodeA.getChildren().addAll(nodeA1, nodeA2, nodeA3);
		
		root.getChildren().addAll(nodeA, nodeB, nodeC);
		treeview.setRoot(root);
	}
	
	@FXML
	public void mouseClick(MouseEvent mouseEvent)
	{
		if(mouseEvent.getClickCount() == 2) //sprawdza czy jest double clicked
		{
			
		
		TreeItem<String> item=treeview.getSelectionModel().getSelectedItem();
		System.out.println(item.getValue());
		}
	}

}
