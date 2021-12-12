import javax.swing.JOptionPane;

public class GradeLetter{
	
		public static void main(String[] args) {
				
		String notaS= JOptionPane.showInputDialog("Vendos piket e marra");
		float nota=Float.parseFloat(notaS);

		switch((int)nota/10)
			{
			case 10:
			case 9:
			JOptionPane.showMessageDialog(null, "A");
			break;
			
			case 8:
			JOptionPane.showMessageDialog(null, "B");
			break;
			
			case 7:
			JOptionPane.showMessageDialog(null, "C");
			break;
			
			case 6:
			JOptionPane.showMessageDialog(null, "D");
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "F");
			break;
			
			
			}


	}

}
