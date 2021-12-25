//Write a program that takes command-line arguments and
//computes the average of their maximum and minimum. Make sure there are command-line arguments
//being passed before you attempt to compute anything.
public class AverageMaxMin {
	
	public static void main(String [] args)
	
	{
		int min=0;
		int max=0;
		if(args.length==0)
			System.out.println("Nuk keni futur ndonje numer");
		else
		{
			//gjej maksimumin
			max=maximum(args);
		
		//gjej minimum
		min=minimum(args);
		}
	
		
		System.out.println("Mesatarja e "+ min+ " "+ max+ " eshte "+ (float)(min+max)/2);
		
	}
	
//te gjendet maksimumi i vektorit args
	public static int maximum(String [] v)
	{
		
		int max= Integer.parseInt(v[0]);
		
		for(int i=0; i<v.length; i++)
		{
			if(Integer.parseInt(v[i])>max)
				max=Integer.parseInt(v[i]);
		}
		
		return max;
	}
	//metode qe gjen minimumin
	public static int minimum(String [] v)
	{
		
		int min= Integer.parseInt(v[0]);
		
		for(int i=0; i<v.length; i++)
		{
			if(Integer.parseInt(v[i])<min)
				min=Integer.parseInt(v[i]);
		}
		
		return min;
	}
}
