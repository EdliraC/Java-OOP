import javax.swing.JOptionPane;

public class CryptographyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cryptography kriptim=new Cryptography();
		
		String input=JOptionPane.showInputDialog("Fut numrin 4 shifror per te inkriptuar\n");
		
		int numer= Integer.parseInt(input);
		
		//afisho numrin e inkriptuar
		String mesazh=String.format("Numri i inkriptuar eshte %s", kriptim.encrypt(numer));
		JOptionPane.showMessageDialog(null, mesazh);
		
		//dekripto numrin 
		mesazh=String.format("Numri i dekriptuar eshte %s", kriptim.decrypt(numer));
		JOptionPane.showMessageDialog(null, mesazh);
		
		
		

	}

}
