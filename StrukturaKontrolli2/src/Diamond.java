
public class Diamond {

	public static void main(String[] args) {
		
	for(int r=1; r<6; r++)
	{
		for(int k=1; k<10; k++)
		{
			if(((k+r)>=6) && ((k+r)<=4+r*2))
				System.out.print("x");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
		//printojme gjysmen e dyte te diamantit
	
	for(int r=6; r<10; r++)
	{
		for(int k=1; k<10; k++)
		{
			if(((k+r)<=14) && ((k+r)>=r*2-4))
				System.out.print("x");
			else
				System.out.print(" ");
		}
		System.out.println();
	}	

	}

}
