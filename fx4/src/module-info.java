module fx4 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.swing;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
}
