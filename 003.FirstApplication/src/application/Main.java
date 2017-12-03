package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;




public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage)  throws Exception
	{
		Button btn = new Button("Click me!"); // mozna dodac standardowy tekst do konstruktora przycisku
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("Hello World");
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn);//layout object (chyba do ukladania obiektow)
		
		Scene scene = new Scene(root, 500, 300); // scena
		primaryStage.setScene(scene); //dodanie sceny do stage (okienka)
		primaryStage.show();//pokazuje okienko
		
	}
	
	public static void main(String[] args) 
	{
		launch(args); //calls javaapplication constructor
	}
	
}