// (Sieve of Eratosthenes) A prime number is any integer greater than 1 that’s evenly divisible
//only by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers. It operates as
//follows:
//a) Create a primitive-type boolean array with all elements initialized to true. Array elements
//with prime indices will remain true. All other array elements will eventually be set to false.
//b) Starting with array index 2, determine whether a given element is true. If so, loop
//through the remainder of the array and set to false every element whose index is a multiple
//of the index for the element with value true. Then continue the process with the
//next element with value true. For array index 2, all elements beyond element 2 in the
//array that have indices which are multiples of 2 (indices 4, 6, 8, 10, etc.) will be set to
//false; for array index 3, all elements beyond element 3 in the array that have indices
//which are multiples of 3 (indices 6, 9, 12, 15, etc.) will be set to false; and so on.
//When this process completes, the array elements that are still true indicate that the index is a prime
//number. These indices can be displayed. Write an application that uses an array of 1000 elements to
//determine and display the prime numbers between 2 and 999. Ignore array elements 0 and 1.
public class SieveEratosthenes {
	
	private static boolean [] primes=new boolean[1000];
	
	public static void main(String [] args)
	{
		//te vendosen te gjithe elementet fillimisht ne vleren true
		for(int i=0; i<primes.length; i++)
			primes[i]=true;
		
		//ndryshojme vlerat e vektorit ne false nese nuk jane prim
		//shumefishat e numrave njeshifror nga 2 ne 9 kontrollohen nese plotepjesetohen me kete njeshifror
		
		for(int i=2; i<primes.length-1; i++)
		{
			for(int j=i+1; j<primes.length; j++)
			{
				if(j%i==0)
					primes[j]=false;
			}
		}
		printoPrimes();
	}
	
public static void printoPrimes()
{	
	int count=0;
	for(int i=1; i<primes.length; i++)
	{
		if(primes[i])
		{
			System.out.println(i);
			count+=1;
		}
	}
	
	System.out.println("Numra prim gjithesej ne intervalin 1-1000 "+count);
}
	
	
		

}
