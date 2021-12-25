
   
//6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
//2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
//a) Write a method that determines whether a number is prime.
//b) Use this method in an application that determines and displays all the prime numbers
//less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
//you’ve found all the primes?
//c) Initially, you might think that n/2 is the upper limit for which you must test to see
//whether a number n is prime, but you need only go as high as the square root of n. Rewrite the program, and run it both ways

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=1000; i++)
		{
			if( isPrime(i))
			{	count+=1;
				System.out.println(i);
				
				
			}
			
			
		}
		System.out.println("Numra prim gjithesej ne intervalin 1-1000 "+count);
	}
	
	
	public static boolean isPrime(int nr) 
	{
		for(int j=2; j<nr/*mund te ndryshohet te behet sa sqrt(nr)*/; j++)
		{
			if((nr%j==0)&&(nr!=j))//nr nuk plotepjestohet me numratorin dhe numri nuk eshte sa numratori, pra vetja dhe numratori nuk eshte 1
				return false;
				
						
		}
		return true;
		
		
		
	}

}