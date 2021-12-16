import java.util.Scanner;

public class max {
	
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		
		//te gjejme max e 10 numrave te futur nga perdoruesi
		
//		te inicializohen numratori nr ne =0
//				te inicializohet variabli max=0
//		
//				ndersa numratori eshte me i vogel ose = 10
//				Lajmero perdoruesin te fut numrin
//				ruaj numrin
//				Nese numri>max
//				atehre max=numri
//				numratori rritet me 1
//				
//				afisho max e gjetur
		
		int numrator=0;
		int max=0;
		int numer;
		
		while(numrator<=10)
		{
			System.out.println("Fut numrin");
			numer=input.nextInt();
			
			if(numer>max)
				max=numer;
			
			numrator=numrator+1;
			
		}
		
		System.out.printf("Numri i madh i futur eshte %d", max);
		
	}

}
