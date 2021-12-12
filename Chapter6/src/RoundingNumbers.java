//For each value read, your program should display the original value, the number rounded to the
//nearest integer, the number rounded to the nearest tenth,
//the number rounded to the nearest hundredth and the number rounded to the nearest thousandth.

//Write an application that defines four methods for rounding a number x in various ways:
//a) roundToInteger( number )
//b) roundToTenths( number )
//c) roundToHundredths( number )
//d) roundToThousandths( number )
import javax.swing.JOptionPane;
public class RoundingNumbers {
	
	private static double numer;

	public static void main(String[] args) {
		
		//perdoruesi te fuse numrin per tu rrumbullakosur
		String input=JOptionPane.showInputDialog("Fut numrin per te rrumbullakosur");
		
		numer=Double.parseDouble(input);
		
		String mesazh=String.format("Numri i futur eshte %f dhe eshte rrumbullakosur ne "+
		"numrin e plote %.2f \n 1 te dhjetat me te aferta me %.2f\n 1/100 me te afert %.2f \n 1/1000 me te afert %.2f \n", 
		numer, roundToInteger( numer ),	roundToTenths( numer ), roundToHundredths( numer ), roundToThousandths( numer ) );
				
		JOptionPane.showMessageDialog(null, mesazh);		
	}
	
	
	
	public static double roundToInteger(double nr)
	{
		return  Math.floor( nr + 0.5 );
	}

	public static double roundToTenths(double nr)
	{
		return  Math.floor( nr * 10 + 0.5 ) / 10;
	}
	
	
	public static double roundToHundredths(double nr)
	{
		return  Math.floor( nr * 100 + 0.5 ) / 100;
	}
	
	public static double roundToThousandths(double nr)
	{
		return  Math.floor( nr * 1000 + 0.5 ) / 1000;
	}
}

//testo me numer me shume shifra pas presjes
