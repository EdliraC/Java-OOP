
public class FactorialTest {

	public static void main(String[] args) {
		
		Factorial faktorial=new Factorial();


		for(int i=1; i<=20; i++)
		{
			System.out.printf("Faktoriali i numrit %d eshte %d \n	", i, faktorial.NFactorial(i) );
		}

	}

}
