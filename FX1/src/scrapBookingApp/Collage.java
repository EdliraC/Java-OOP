package scrapBookingApp;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Collage extends Application{
	
	public static void main(String [] args)
	{
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage teatri) throws Exception
	{
		Parent rrenja=FXMLLoader.load(getClass().getResource("scrapBooking.fxml"));
		
		Scene skena=new Scene(rrenja);
		teatri.setTitle("Kolazh Pejsazhesh");
		teatri.setScene(skena);
		teatri.show();
		
		
	}
	

}
