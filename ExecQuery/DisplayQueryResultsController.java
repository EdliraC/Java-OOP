package ExecQuery;

import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class DisplayQueryResultsController {

    @FXML     private BorderPane borderPane;
//    @FXML	  private SwingNode swingNode;
    @FXML     private TextField filterTextField;
    @FXML     private TextArea queryTextArea;
    
    private final String DATABASE_URL="jdbc:mysql://localhost/publicbudget";
    private final String USERNAME="root";
    private final String PASSWORD="";
    
    private final String DEFAULT_QUERY="SELECT * FROM expenditurebudgeted";
    //variabla per te konfiguruar JTable
    private ResultSetTableModel tableModel;
    private TableRowSorter<TableModel> sorter;

    public void initialize()
    {
    	queryTextArea.setText(DEFAULT_QUERY);
    	
    try {
    	
    	tableModel=new ResultSetTableModel(DATABASE_URL, USERNAME, PASSWORD,DEFAULT_QUERY);
    	
    	JTable tabelRezultat=new JTable(tableModel);
    	
    	//row sorting
    	sorter = new TableRowSorter<TableModel>(tableModel);
    	tabelRezultat.setRowSorter(sorter);
    	
    	//ta vendosim rezultatin ne BorderPane
		SwingNode swingNode=new SwingNode();
		swingNode.setContent(new JScrollPane(tabelRezultat));
		borderPane.setCenter(swingNode);
		//borderPane.getChildren().add(swingNode);
    	
    }
    catch(SQLException sqlE)
    {
    	displayAlert(AlertType.ERROR, "Database Error", sqlE.getMessage());
    	tableModel.disconnectFromDatabase();
    	System.exit(1);
    	
    }
    	
    	
    }
    
    @FXML
    void applyFilterButtonPressed(ActionEvent event) {
    	

    }

    @FXML
    void submitQueryButtonPressed(ActionEvent event) {
    	
    	try {
    		tableModel.setQuery(queryTextArea.getText());
    	}
    	
    	catch(SQLException sqlE)
    	{
    		displayAlert(AlertType.ERROR, "Database Error", sqlE.getMessage());
    		
    		try {
    			tableModel.setQuery(DEFAULT_QUERY);
    			queryTextArea.setText(DEFAULT_QUERY);
    		}
    		
    		catch(SQLException sqlE2)
    		{
    			displayAlert(AlertType.ERROR, "Database Error", sqlE2.getMessage());
    			tableModel.disconnectFromDatabase();
    			System.exit(1);
    		}
    	}

    }
    
    public void displayAlert(AlertType type, String errorTitle, String errorMessage)
    {
    	Alert a = new Alert(type);
    	a.setTitle(errorTitle);
    	a.setContentText(errorMessage);
    	a.showAndWait();
    }

}
