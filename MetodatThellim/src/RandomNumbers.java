import java.security.SecureRandom;

public class RandomNumbers {

	public static void main(String[] args) {


		SecureRandom nrRastit= new SecureRandom();
		





//		f) –3 ≤n ≤ 11.
		
//		a) 1 ≤n ≤ 2.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(2)+1;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}
	
//		b) 1 ≤n ≤ 100.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(99)+1;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}
//		c) 0 ≤n ≤ 9.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(9);
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}	
		
//		d) 1000 ≤n ≤ 1112.
		
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(112)+1000;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}
		
//		e) –1 ≤n ≤ 1.
		
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(3) -1;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}	
	
		
//		f) –3 ≤n ≤ 11.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(15) -3;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}
		
		
		
//		Write statements that will display a random number from each of the following sets:
//			a) 2, 4, 6, 8, 10.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(5)*2 +2;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}
		
		
		
//			b) 3, 5, 7, 9, 11.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(5)*2 +3;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}		
//			c) 6, 10, 14, 18, 22.
		for (int i=1; i<=20; i++)
		{
			int rezultatRasti= nrRastit.nextInt(5)*4 +6;
			System.out.print(rezultatRasti+" ");
			
			if(i%5==0)
				System.out.println();
		}
		
		
	}

}
