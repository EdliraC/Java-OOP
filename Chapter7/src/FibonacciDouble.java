
//Modify the application you wrote in part (a) to use double instead of int to calculate
//and return Fibonacci numbers, and use this modified application to repeat part (b).
//	Determine the largest Fibonacci number that can be displayed on your system.
//c) Modify the application you wrote in part (a) to use double instead of int to calculate
//and return Fibonacci numbers, and use this modified application to repeat part (b).


import java.util.Scanner;

public class FibonacciDouble {
	
	public static void main(String [] args)
	{
		//lejo perdoruesin te fut termin n te serise Fibonacci
		Scanner input=new Scanner(System.in);
		System.out.println("Vendos numrin n te kufizes se serise");
		
		int n=input.nextInt();
		
		System.out.println("Kufiza "+ n+ " ka vleren "+ fibonacci(n));
		
		
	}
	
	private static double fibonacci(int nrKufize)
		{
			double [] fibonacci=new double[nrKufize];
			fibonacci[0]=0;
			fibonacci[1]=1;
			
			for(int i=2; i<nrKufize; i++)
			{
				fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			}
			
			return fibonacci[nrKufize-1];
	}

}//f(1400) kufiza me e madhe qe mudn te shfaqet ne kete seri me numra me presje ~1.057E292

