import javax.swing.JOptionPane;
public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Krijojme nje objekt per te testuar Faktorialin
		Factorial Faktorial2= new Factorial();
		
		String input=JOptionPane.showInputDialog("Vendosni numrin per te faktorizuar");
		int nr=Integer.parseInt(input);
		
		String mesazh=String.format("Faktoriali i numrit %d eshte %.2f\n", nr, Faktorial2.NFactorial(nr));
		JOptionPane.showMessageDialog(null, mesazh);
		
		//Gjejme vleren e konstantes e ne varesi te saktesise se kerkuar nga perdoruesi
		input=JOptionPane.showInputDialog("Vendosni numrin e saktesise se konstantes E");
		nr=Integer.parseInt(input);
		
		mesazh=String.format("Konstantja E e llogaritur sipas saktesise %d\n eshte %.7f", nr, Faktorial2.eConstant(nr));
		JOptionPane.showMessageDialog(null, mesazh);
		
		
		

	}

}
