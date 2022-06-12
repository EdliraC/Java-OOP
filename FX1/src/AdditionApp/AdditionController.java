package AdditionApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdditionController {

    @FXML
    private TextField numriDyteFushe;

    @FXML
    private Label numriDyteLabel;

    @FXML
    private TextField numriPareFushe;

    @FXML
    private Label numriPareLabel;

    @FXML
    private Label shumaLlogaritur;

    @FXML
    private void llogaritShumenButonShtypur(ActionEvent event) {
    	try {
    		int numer1=Integer.parseInt(numriPareFushe.getText());
    		
    		int numer2=Integer.parseInt(numriDyteFushe.getText());
    		
    		shumaLlogaritur.setText(String.format("%d", numer1+numer2));
    	}
    	catch (NumberFormatException e)
    	{
    		numriPareFushe.setText("Vendos numer te plote");
    		numriPareFushe.selectAll();
    		numriPareFushe.requestFocus();
    		
    		numriDyteFushe.setText("Vendos numer te plote");
    		numriPareFushe.selectAll();
    		numriPareFushe.requestFocus();
    		
    	}
    }

}
