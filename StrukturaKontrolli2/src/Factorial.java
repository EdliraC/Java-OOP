
public class Factorial {
	
	
	public long NFactorial(int n)
	{
		long F=1;
			//			
			//			//llogarit faktorialin
			//			while(n>=0)
			//			{
			//				if(n==0)
			//					F=F*1;				
			//					
			//				else
			//					F=F*n;
			//				
			//					
			//				n=n-1;	
			//					
			//				
			//			}
		
		
		for(int i=n; i>=1; i--)
		{
			if(i==0)
				F=F*1;
			else 
				F=F*i;
			
		}
			
			
		
		
			return F;
			
	
	}
	
}
