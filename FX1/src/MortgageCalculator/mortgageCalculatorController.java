package MortgageCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class mortgageCalculatorController {
	private static final NumberFormat currency= NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent=NumberFormat.getPercentInstance();
	private int vite;
	

    @FXML
    private TextField cmimiFushe;

    @FXML
    private TextField interesiFushe;

    @FXML
    private TextField kesti10Fushe;

    @FXML
    private TextField kesti20Fushe;

    @FXML
    private TextField kesti30Fushe;

    @FXML
    private TextField kestiFushe;

    @FXML
    private TextField pagesaNeDoreFushe;

    @FXML
    private Slider viteSlider;

    @FXML
    private Label viteSliderEtikete;

    @FXML
    private void llogaritKestetButonShtypur(ActionEvent event) {
    	
    	try {
    			BigDecimal cmimi=new BigDecimal(cmimiFushe.getText());
    			BigDecimal pagesaDore= new BigDecimal(pagesaNeDoreFushe.getText());
    			BigDecimal interesPerqindje=new BigDecimal(interesiFushe.getText());
    			
    			
    			
    			BigDecimal principali=cmimi.subtract(pagesaDore);
    			
    			BigDecimal kesti10= principali.multiply(interesPerqindje).multiply((interesPerqindje.add(BigDecimal.ONE)).pow(10)).divide(((interesPerqindje.add(BigDecimal.ONE)).pow(10)).subtract(BigDecimal.ONE),2, RoundingMode.HALF_UP).divide(new BigDecimal(12),2, RoundingMode.HALF_UP);
    			BigDecimal kesti20= principali.multiply(interesPerqindje).multiply((interesPerqindje.add(BigDecimal.ONE)).pow(20)).divide(((interesPerqindje.add(BigDecimal.ONE)).pow(20)).subtract(BigDecimal.ONE),2, RoundingMode.HALF_UP).divide(new BigDecimal(12),2, RoundingMode.HALF_UP);
    			BigDecimal kesti30= principali.multiply(interesPerqindje).multiply((interesPerqindje.add(BigDecimal.ONE)).pow(30)).divide(((interesPerqindje.add(BigDecimal.ONE)).pow(30)).subtract(BigDecimal.ONE),2, RoundingMode.HALF_UP).divide(new BigDecimal(12),2, RoundingMode.HALF_UP);
    			
    			
    			kesti10Fushe.setText(currency.format(kesti10));
    			kesti20Fushe.setText(currency.format(kesti20));
    			kesti30Fushe.setText(currency.format(kesti30));
    			
    			BigDecimal kesti=principali.multiply(interesPerqindje).multiply((interesPerqindje.add(BigDecimal.ONE)).pow(vite)).divide(((interesPerqindje.add(BigDecimal.ONE)).pow(vite)).subtract(BigDecimal.ONE),2, RoundingMode.HALF_UP).divide(new BigDecimal(12),2, RoundingMode.HALF_UP);
    			
    			kestiFushe.setText(currency.format(kesti));
    			
    	}
    	
    	catch (NumberFormatException ex) {
    		cmimiFushe.setText("Vendos Cmimin");
    		cmimiFushe.selectAll();
    		cmimiFushe.requestFocus();
    		
    	}

    	
    }
    
    public void initialize()
    {
    	//currency.setRoundingMode(RoundingMode.HALF_UP);
    	
    	viteSlider.valueProperty().addListener(
    			new ChangeListener<Number>() {
    				@Override
    				public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
    					vite= newValue.intValue();
    					viteSliderEtikete.setText(String.format("%d",vite));
    				}
    			}
    			
    			
    			
    			
    			);
    	
    }

}
