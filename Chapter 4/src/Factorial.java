
public class Factorial {
	
	
	public double NFactorial(int n)
	{
		int F=1;
			
			//llogarit faktorialin
			while(n>=0)
			{
				if(n==0)
					F=F*1;				
					
				else
					F=F*n;
				
					
				n=n-1;	
					
				
			}
			return F;
			
		
	}
	
	public double eConstant(int noCalcTerms)
	{
		int i=1;
		double e=1;
		while(i<=noCalcTerms)
		{	
			e=e+ 1/NFactorial(i);
			i++;
			
		}
		return e;
	}

	
	public double ePowerX(float x, int noCalcTerms)
	{
		double ex=0;//ruan shumen e llogaritur per ex
		int n=1;//ruan numerimin e termave te formules
		
		while(n<=noCalcTerms)
		{
			ex=ex+Math.pow(x, n)/NFactorial(n);
			
			//inkrementojme n deri te numri i termave
			n=n+1;
		
			
		}
		
		return ex;
			
			
		
	}
}
