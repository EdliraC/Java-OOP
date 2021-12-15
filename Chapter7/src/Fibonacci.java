//Write a method fibonacci( n ) that calculates the nth Fibonacci number. Incorporate
//this method into an application that enables the user to enter the value of n.
//b) Determine the largest Fibonacci number that can be displayed on your system.

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String [] args)
	{
		//lejo perdoruesin te fut termin n te serise Fibonacci
		Scanner input=new Scanner(System.in);
		System.out.println("Vendos numrin n te kufizes se serise");
		
		int n=input.nextInt();
		
		System.out.println("Kufiza "+ n+ " ka vleren "+ fibonacci(n));
		
		
	}
	
	private static int fibonacci(int nrKufize)
		{
			int [] fibonacci=new int[nrKufize];
			fibonacci[0]=0;
			fibonacci[1]=1;
			
			for(int i=2; i<nrKufize; i++)
			{
				fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			}
			
			return fibonacci[nrKufize-1];
	}

}//f(47) kufiza me e madhe e kesaj serie me numra te plote
