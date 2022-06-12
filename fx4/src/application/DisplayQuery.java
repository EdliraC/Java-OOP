package application;

import javafx.embed.swing.SwingNode;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.stage.Stage;



public class DisplayQuery extends Application{
	
	public static void main(String [] args)
	{
		launch(args);
		
	}
	
	@Override
	public void start(Stage teatri) throws Exception
	{
		Parent rrenje= FXMLLoader.load(getClass().getResource("DisplayQueryResults.fxml"));
		Scene skene=new Scene(rrenje);
		teatri.setTitle("Execute Query");
			
		teatri.setScene(skene);
		teatri.show();
		
	}
	
	
	
	

}
