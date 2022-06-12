package enhancedTipCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;


public class enhancedTipCalculator extends Application {

	public static void main(String [] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage teatri) throws Exception
	{
		Parent rrenje=FXMLLoader.load(getClass().getResource("enhancedTipCalculator.fxml"));
		
		Scene skene=new Scene(rrenje);
		teatri.setTitle("Llogaritese e Bakshishit");
		teatri.setScene(skene);
		teatri.show();
	}
	
}
