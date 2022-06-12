
public class HugeInteger {
	
	private int [] hugeNumber=new int[40];
	
	public HugeInteger()
	{
		
	}
	
	public HugeInteger(String s)
	{
		this.parse(s);
	}
	
	
	private void parse(String n)
	{
		for(int i=0; i<40; i++)
		{
			hugeNumber[i]=Integer.parseInt(String.format("%s", n.charAt(i)));
		}
	}
	
	@Override
	public String toString()
	{
		String numriString= "";
		for(int i=0; i<40; i++)
		{
			numriString= numriString + String.format("%d", hugeNumber[i]);
		}
		
		
		return numriString;
	}
	
	
	public HugeInteger add(HugeInteger n2)
	{
		int carry=0;
		int sumInteger;
		
		HugeInteger sum=new HugeInteger();
		
		for(int i=39; i>=0; i-- )
		{
			sumInteger=this.hugeNumber[i]+ n2.hugeNumber[i]+carry;
			if(sumInteger>9)
			{
				sum.hugeNumber[i]=sumInteger%10;
				carry= sumInteger/10;
				
			}
			else
			{
				sum.hugeNumber[i]=sumInteger;
				carry=0;
				
			}
				
						
		}
		//kontrollojme nese ka overflow to numrit rezultat
		//if(carry==0)
				return sum;
		
	}
	
	public boolean isGreaterThan(HugeInteger n2)
	{
		
		if(!this.isEqualTo(n2))
		{
			for(int i=0; i<40; i++)
			{
				if(!(this.hugeNumber[i]>n2.hugeNumber[i]))
					return false;
				
			}
		return true;
		}
		
		return false;
	}
	
	public boolean isEqualTo(HugeInteger n2)
	{
		for(int i=0; i<40; i++)
		{
			if(this.hugeNumber[i]!=n2.hugeNumber[i])
				return false;
		}
		return true;
	}
	
	
	public HugeInteger substract(HugeInteger n2 )
	{
		HugeInteger substraction= new HugeInteger();
	
		if(!this.isEqualTo(n2)&& this.isGreaterThan(n2))
		{
		
		if(this.hugeNumber[0]>=n2.hugeNumber[0])
		{
			for(int i=39; i>=0; i-- )
			{	
				
				{
					if(this.hugeNumber[i]<n2.hugeNumber[i])
					{
						this.hugeNumber[i]+=10;
						substraction.hugeNumber[i]=this.hugeNumber[i]-n2.hugeNumber[i];
						this.hugeNumber[i-1]--;
					}
					
					else 
					{
						substraction.hugeNumber[i]=this.hugeNumber[i]-n2.hugeNumber[i];
					}
				}
			}
		
		}
			
//			else //nese numri i pare eshte me i vogel se numri i dyte
//			{//shkembejne vendet numrat per tu zbritur
//				HugeInteger n1=this;
//				
//				n2.substract(n1);
//				//ndryshojme shenjen e rezultatit
//				substraction.hugeNumber[0]=0-substraction.hugeNumber[0];
//				
//			}
						
									
			
		}
		
		return substraction;
	}
}

