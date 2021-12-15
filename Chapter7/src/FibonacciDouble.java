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

}

