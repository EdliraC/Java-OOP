//(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//Write an application that inputs ten numbers, each between 10 and 100, both inclusive.
//Save each number that was read in an array that was initialized to a value of –1 for all elements.
//Assume a value of –1 indicates an array element is empty. You are then to process the array, and
//remove duplicate elements from the array containing the numbers you input. Display the contents
//of the array to demonstrate that the duplicate input values were actually removed. [Note: do not
//display the array elements where the value is –1.]
import java.util.Scanner;

public class duplicateElimination {
	
	public static void main(String [] args)
	{
		int [] tenNumbers= new int[10];
		
		//initialize to -1 all elements
		
		for(int i=0; i<tenNumbers.length; i++)
			tenNumbers[i]=-1;
			

		//input ten elements
		Scanner input=new Scanner(System.in);
		int numer;
		
		for(int i=0; i<tenNumbers.length; i++)
		{
			System.out.println("Fut nje numer ndermjet 10 dhe 100");
			numer=input.nextInt(); 
			
			if((numer<10) || (numer>100))
				System.out.println("Vlere e palejuar");
			else
				tenNumbers[i]=numer;
					
		}
		
		hiqPerseritjet(tenNumbers);
		
		afishoVektorin(tenNumbers);
			
			
	}
	
	public static void hiqPerseritjet(int[] v)
	{
		for(int i=0; i<v.length-1; i++)
		{
			for(int j=i+1; j<v.length; j++)
				if(v[i]==v[j])
					v[j]=-1;
		
		}
		
		
	}
	
	public static void afishoVektorin(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=-1)
				System.out.println(a[i]);
		}
		
	}
	

}
