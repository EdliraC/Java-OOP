import java.util.Scanner;

public class ClassAverage {

	public static void main(String [] args)
	{
		Scanner input =new Scanner(System.in);
		int total;
		int pike;
		int numrator;
		int mesatare;
		
		total=0;
		numrator=1;
		
		while(numrator<10)
		{
			System.out.println("Vendosni piket");
			pike=input.nextInt();
			total=total+pike;
			numrator=numrator+1;
			
		}
		
		mesatare=total/10;
		
		System.out.printf("SHuma e notave eshte %d \n", total);
		System.out.printf("mesatarja eshte %d", mesatare);
		
		
	}
}
