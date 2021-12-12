//Write an application that calculates the average of a series
//of integers that are passed to method average using a variable-length argument list. Test your method
//with several calls, each with a different number of arguments.

public class AverageOfInt {
	
	public static float Average(int...numer)
	{//inicializojme variablat
		int total=0;
		int count=0;
		
		for(int n: numer)
		{//gjen shumen e kufizave
			total=total+n;
			count++;
		}
		//kthen mesataren
		return (float)total/count;
	}

	
	public static void main(String [] args)
	{
		int x1=2;
		int x2=3;
		int x3=5;
		int x4=5;
		int x5=7;
				
		
		System.out.println("Mesatarja e numrave "+ x1+" "+ x2+" "+ x3+ " eshte "+ Average(x1, x2, x3) );
		System.out.println("Mesatarja e numrave "+ x1+" "+ x2+" "+ x3+ " "+ x4+" "+x5+" eshte "+ Average(x1, x2, x3, x4, x5) );
		

	}
}
