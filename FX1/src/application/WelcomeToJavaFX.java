package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;


public class WelcomeToJavaFX extends Application{
	
	@Override
	public void start(Stage teatri) throws Exception
	{
		
		Parent rrenja=FXMLLoader.load(getClass().getResource("WelcomeToJavaFX.fxml"));
		Scene skene=new Scene(rrenja);
		teatri.setScene(skene);
		teatri.show();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
