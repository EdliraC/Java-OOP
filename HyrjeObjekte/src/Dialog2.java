import javax.swing.JOptionPane;

public class Dialog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=JOptionPane.showInputDialog("Vendosni emrin tuaj");
		
		//Pergatis nje mesazh per perdoruesin
		String mesazh=String.format("Mireserdhet %s ne kete kurs", name);
		
		//Afishoj mesazhin e pergatitur ne nje dritare dialogu
		JOptionPane.showMessageDialog(null, mesazh);
		
		

	}

}
