package MortgageCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.stage.Stage;


public class mortgageCalculator extends Application{
	
	public static void main(String [] args)
	{
		launch(args);
		
	}
	
	@Override
	public void start(Stage teatri) throws Exception
	{
		Parent rrenje= FXMLLoader.load(getClass().getResource("mortgageCalculator.fxml"));
		Scene skene=new Scene(rrenje);
		teatri.setTitle("Llogaritese Kredie");
		teatri.setScene(skene);
		teatri.show();
		
	}
	
	
	
	

}
