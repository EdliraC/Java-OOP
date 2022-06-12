package enhancedTipCalculator;
import javafx.event.ActionEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class enhancedTipCalculatorController {
	
	private static final NumberFormat currency=NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent=NumberFormat.getPercentInstance();
	private BigDecimal tipPercentage=new BigDecimal(0.15);

    @FXML
    private TextField bakshishFushe;

    @FXML
    private Label bakshishLabel;

    @FXML
    private Slider bakshishPerqindjeSlider;

    @FXML
    private TextField nrPersonaFushe;

    @FXML
    private Label nrPersonaLabel;

    @FXML
    private Label pagesaLabel;

    @FXML
    private TextField pagesaPersonFushe;

    @FXML
    private Label pagesaPersonLabel;

    @FXML
    private Label perqindjeBakshishLabel;

    @FXML
    private TextField pertuPaguarFushe;

    @FXML
    private TextField totalFushe;

    @FXML
    private Label totalLabel;

    @FXML
    private void llogaritFaturenButonShtypur(ActionEvent event) {
    	try {
    		BigDecimal amount=new BigDecimal(totalFushe.getText());
    		BigDecimal tip=amount.multiply(tipPercentage);
    		BigDecimal total=amount.add(tip);
    		
    		BigDecimal nrPersona=new BigDecimal(nrPersonaFushe.getText());
    		
    		BigDecimal pagesaPerson=total.divide(nrPersona);
    		
    		bakshishFushe.setText(currency.format(tip));
    		pertuPaguarFushe.setText(currency.format(total));
    		pagesaPersonFushe.setText(currency.format(pagesaPerson)); 	   		
    	   		
    		
    	}
    	
    	catch (NumberFormatException e)
    	 {
    		totalFushe.setText("Enter amount");
    		totalFushe.selectAll();
    		totalFushe.requestFocus();
    		
    	 }
    	
    }
    public void initialize() 
    {
    	currency.setRoundingMode(RoundingMode.HALF_UP);
    	
    	bakshishPerqindjeSlider.valueProperty().addListener(new ChangeListener<Number>()
    	{
    		@Override
    		public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue)
    		{
    			tipPercentage=BigDecimal.valueOf(newValue.intValue()/100.0);
    			perqindjeBakshishLabel.setText(percent.format(tipPercentage));
    		}
    	}
    	);
    }

}
