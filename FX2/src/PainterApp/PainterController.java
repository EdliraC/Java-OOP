package PainterApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;



public class PainterController{
	
	private enum PenSize{
		SMALL(2),
		MEDIUM(4),
		LARGE(6);
		
		private final int radius;
		
		PenSize(int radius) {this.radius= radius;}
		
		public int getSize() {return radius;}
	};
	

    @FXML     private RadioButton blackRadioButton;
    @FXML     private RadioButton greenRadioButton;
    @FXML     private RadioButton redRadioButton;
    @FXML     private RadioButton blueRadioButton;
    
    @FXML     private RadioButton smallRadioButton;
    @FXML     private RadioButton mediumRadioButton;
    @FXML     private RadioButton largeRadioButton;
    

    @FXML     private Button clearButton;
    @FXML     private Button undoButton;

    @FXML     private ToggleGroup colorToggleGroup;
    @FXML     private ToggleGroup sizeToggleGroup;

    @FXML     private Pane drawingAreaPane;

    private PenSize radius=PenSize.SMALL;
    private Paint brushColor=Color.BLACK;

   
    public void initialize() {
    	blackRadioButton.setUserData(Color.BLACK);
    	greenRadioButton.setUserData(Color.GREEN);
    	redRadioButton.setUserData(Color.RED);
    	blueRadioButton.setUserData(Color.BLUE);
    	
    	smallRadioButton.setUserData(PenSize.SMALL);
    	mediumRadioButton.setUserData(PenSize.MEDIUM);
    	largeRadioButton.setUserData(PenSize.LARGE);
    }

  

    @FXML
   public  void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();

    }

    @FXML
    public void colorRadioButtonSelected(ActionEvent event) {
    	brushColor= (Color)colorToggleGroup.getSelectedToggle().getUserData();

    }

    @FXML
   public void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle=new Circle(event.getX(), event.getY(), radius.getSize(), brushColor);
    	drawingAreaPane.getChildren().add(newCircle);

    }

    @FXML
    public void sizeRadioButtonSelected(ActionEvent event) {
    	
    	radius=(PenSize)sizeToggleGroup.getSelectedToggle().getUserData();

    }

    @FXML
    public void undoButtonPressed(ActionEvent event) {
    	
    	int count=drawingAreaPane.getChildren().size();
    	
    	if(count>0)
    		drawingAreaPane.getChildren().remove(count-1);

    }
    
    

}
