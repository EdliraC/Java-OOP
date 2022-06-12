package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class shumaController {

    @FXML    private TextField numer1Fusha;

    @FXML     private TextField numer2Fusha;

    @FXML     private TextField shumaFusha;

    @FXML     void llogaritShumenButonShtypur(ActionEvent event) {
    	
    	
	    	int numer1= Integer.parseInt(numer1Fusha.getText());
	    	int numer2=Integer.parseInt(numer2Fusha.getText());
	    	
	    	int shuma=numer1+numer2;
	    	
	    	shumaFusha.setText(String.format("%d", shuma));
    	
    	
//    	catch (NumberFormatException e)
//    	{
//    		numer1Fusha.setText("Fut perseri nje numer");
//    		numer2Fusha.setText("Fut perseri nje numer");
//    		numer1Fusha.selectAll();
//    		numer2Fusha.selectAll();
//    		numer1Fusha.requestFocus();
//    		numer2Fusha.requestFocus();
//    	}
    }

}
