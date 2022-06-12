package application;
//(Running the Welcome App) In Section 12.4, you built the Welcome app’s GUI and previewed it using 
//Scene Builder’s Show Preview in Window option. Create an Application subclass—
//like the one shown in Section 12.5.4—to load and display Welcome.fxml in a JavaFX window.
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WelcometoFX extends Application{
	
	public static void main(String []args)
	{//krijon nje objekt te tipit WelcometoFX the therret metoden start() te tij
		launch(args);
	}

	@Override
	public void start(Stage teater) throws Exception
	{
		Parent rrenja=FXMLLoader.load(getClass().getResource("WelcometoFX.fxml"));
		Scene skena=new Scene(rrenja);
		teater.setTitle("Welcome to FX");
		teater.setScene(skena);
		teater.show();
	}
}
