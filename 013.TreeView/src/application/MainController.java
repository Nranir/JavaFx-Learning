package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
		
		TreeItem<String> nodeA = new TreeItem<>("nodeA");
		TreeItem<String> nodeB = new TreeItem<>("nodeB");
		TreeItem<String> nodeC = new TreeItem<>("nodeC");
		
		
		TreeItem<String> nodeA1 = new TreeItem<>("nodeA1");
		TreeItem<String> nodeA2 = new TreeItem<>("nodeA2");
		TreeItem<String> nodeA3 = new TreeItem<>("nodeA3");
		nodeA.getChildren().addAll(nodeA1, nodeA2, nodeA3);
		
		root.getChildren().addAll(nodeA, nodeB, nodeC);
		treeview.setRoot(root);
	}

}
