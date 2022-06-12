import java.util.Scanner;

public class HugeIntegerTest {
	
	public static void main(String [] args) {
		
		
		
		System.out.println("Fut nje numer me 40 shifra");
		Scanner input=new Scanner(System.in);
		String nr=input.next();

		HugeInteger numerMadh=new HugeInteger(nr);
		
		System.out.println(numerMadh);
		
		
	
		
		
		
		System.out.println(numerMadh.add(numerMadh));
		System.out.println("Fut nje numer tjeter me 40 shifra");
		
		HugeInteger numerMadh2=new HugeInteger(input.next());
		
		
		
		System.out.println(numerMadh.substract(numerMadh2));
		
		
		
		
	}
	
	
	

}
