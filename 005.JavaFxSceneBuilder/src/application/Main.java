package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;





public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage)  throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Demo.fxml"));
		
		Scene scene = new Scene(root); // scena
		primaryStage.setTitle("My Title"); //tytul okienka
		primaryStage.setScene(scene); //dodanie sceny do stage (okienka)
		primaryStage.show();//pokazuje okienko
		
	}
	
	public static void main(String[] args) 
	{
		launch(args); //calls javaapplication constructor
	}
	
}