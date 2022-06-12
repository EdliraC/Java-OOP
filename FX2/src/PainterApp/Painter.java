
package PainterApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Painter extends Application {
	
	@Override
	public void start(Stage teater) throws Exception
	{
		Parent rrenje=FXMLLoader.load(getClass().getResource("Painter.fxml"));
		Scene skena=new Scene(rrenje);
		
		teater.setTitle("Painting Application");
		teater.setScene(skena);
		teater.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
