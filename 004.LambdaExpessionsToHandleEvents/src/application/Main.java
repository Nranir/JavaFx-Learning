package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;





public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage)  throws Exception
	{
		Button btn = new Button("Click me!"); // mozna dodac standardowy tekst do konstruktora przycisku
		Button exit = new Button("Exit");
		
		
		exit.setOnAction(e -> 
		{
			System.out.println("Exitting Application");
			System.exit(0);
		});
		//metoda na gorze odwzorowuje to co jest na dole w funkcji "handle" to na gorze jest nazywane "lambda expression"
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("Hello World");
			}
		});
		
		
		
		VBox root = new VBox();
		
		root.getChildren().addAll(btn, exit); // to pozwala kilkanacie obiektow
		//root.getChildren().add(btn);//layout object (chyba do ukladania obiektow)
		
		Scene scene = new Scene(root, 500, 300); // scena
		primaryStage.setTitle("My Title"); //tytul okienka
		primaryStage.setScene(scene); //dodanie sceny do stage (okienka)
		primaryStage.show();//pokazuje okienko
		
	}
	
	public static void main(String[] args) 
	{
		launch(args); //calls javaapplication constructor
	}
	
}