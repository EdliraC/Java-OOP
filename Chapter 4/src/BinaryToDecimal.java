import javax.swing.JOptionPane;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perdoruesi te fuse numrin binar
	String input = JOptionPane.showInputDialog("Fut numrin binar\n");
	int nBinar=Integer.parseInt(input);
	
	//te konvetoje ne numer dhjetor
	
	int decimal=0;
	int pozicion=0;
	int mBinar;
	int digit;
	
	while(nBinar/Math.pow(10, pozicion)!=0)
	{
		mBinar= (nBinar/(int)Math.pow(10,pozicion));
		digit= mBinar % 10;
		decimal=decimal+ digit*(int)Math.pow(2, pozicion);
		
		pozicion++;
		
	}

	
	String mesazh=String.format("Numri binar %d ne sistemin dhjetor eshte %d\n", nBinar, decimal);
	
	JOptionPane.showMessageDialog(null, mesazh);
}
}
