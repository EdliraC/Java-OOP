package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class shuma extends Application{
	@Override
	public void start(Stage teater) throws Exception
	{
		Parent rrenje=FXMLLoader.load(getClass().getResource("shuma.fxml"));
		Scene skene=new Scene(rrenje);
		teater.setTitle("shuma");
		teater.setScene(skene);
		teater.show();
	}

}

