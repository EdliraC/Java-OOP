package AdditionApp;
//12.1 (Addition App) Create a JavaFX version of the addition program in Fig. 2.7. 
//Use two TextFields to receive the user’s input and a Button to initiate the calculation. Display the results in a
//Label. Since TextField method getText returns a String, you must convert the String the user
//enters to an int for use in calculations. Recall that the static method parseInt of class Integer
//takes a String argument representing an integer and returns the value as an int.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Addition extends Application{
	
	//main
	public static void main(String [] args)
	{
		launch(args);// te krijohet nje objekt i klases Addition dhe te thirret metoda e saj fillo
	}
	@Override
	public void start(Stage teater) throws Exception
	{
		Parent rrenje=FXMLLoader.load(getClass().getResource("Addition.fxml"));
		
		Scene skene=new Scene(rrenje);
		
		teater.setTitle("Shuma e dy numrave");
		teater.setScene(skene);
		teater.show();
		
	}

}
