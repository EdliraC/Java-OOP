import javax.swing.JOptionPane;

public class DialogShuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1=JOptionPane.showInputDialog("Vendosni numrin e pare");
		//konvertoj ne Integer Stringun e pare e futur
		int nr1=Integer.parseInt(input1);
		
		String input2=JOptionPane.showInputDialog("Vendosni numrine e dyte");
		
		//konvertoj ne integer kete string te dyte
		
		int nr2=Integer.parseInt(input2);
		
		int shuma=nr1+nr2;
		
		String mesazh= String.format("Shuma e dy numrave te futur eshte %d", shuma);
		
		JOptionPane.showMessageDialog(null, mesazh);
		

	}

}
