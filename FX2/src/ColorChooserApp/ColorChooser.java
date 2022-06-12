package ColorChooserApp;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class ColorChooser extends Application{
	@Override
	public void start(Stage teater) throws Exception
	{
		Parent rrenje=FXMLLoader.load(getClass().getResource("ColorChooser.fxml"));
		Scene skene=new Scene(rrenje);
		teater.setTitle("Color Chooser");
		teater.setScene(skene);
		teater.show();
	}

}
