//6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//second integer is a multiple of the first. The method should take two integer arguments and return
//true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
//Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
//time) and determines whether the second value in each pair is a multiple of the first


import java.util.Scanner;
public class Multiples {
	private static int numer1;
	private static int numer2;
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		//vendos numrat 
		System.out.println("Vendosni numrin e pare\n");
		
		numer1=input.nextInt();
		//vendos numrin e dyte
		System.out.println("Vendosni numrin e pare\n");
		
		numer2=input.nextInt();
		
	while((numer1!=-1) && (numer2!=-1))
			{
		
			System.out.println(numer1+"\t" + numer2+ "\t"+isMultiple(numer1, numer2));
			
			//perdoruesi te fuse numrat e tjere
			
			System.out.println("Vendosni numrin e pare\n");
			
			numer1=input.nextInt();
			//vendos numrin e dyte
			System.out.println("Vendosni numrin e pare\n");
			
			numer2=input.nextInt();
			
			}
		
	
	
		
		
	}
	
	
	public static boolean isMultiple(int nr1, int nr2)
	{
		if(nr1 % nr2==0)
			return true;
		else 
			return false;
		
			
		
	}

}
