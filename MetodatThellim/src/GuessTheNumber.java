//5.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
//program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
//guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
//low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
//user for the next guess. When the user enters the correct answer, display Congratulations. You  guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique
//employed in this problem is similar to a binary search, which is discussed in Chapter 19,
//Searching, Sorting and Big O.]
import java.security.SecureRandom;
import java.util.Scanner;
public class GuessTheNumber {
	
	private static SecureRandom nrRasti=new SecureRandom();
	
	public static void main(String [] args)
	
	{ // sigurojme qe perdoruesi do te luaje me lojen, -1 per te dale nga loja
		int nrPerdoruesi=0;
		
		while(nrPerdoruesi!=-1)
		{
			//1.Gjenerojme nje numer rasti nga 1 ne 1000
			int numer = randomInt();
			
			Scanner input=new Scanner(System.in);
			
			
			while(nrPerdoruesi!=numer)
			{
				//2. Kerkojme perdoruesin te gjeje kete numer duke futur nje nga tastiera
				System.out.println("Gjeni numrin e fshehte ne segmentin [1-1000]");
				nrPerdoruesi=input.nextInt();
				//kontrollojme vleren e futur nese eshte sa numri i rastit i fshehte
				if(nrPerdoruesi> numer)
					System.out.println("Numri qe futet eshte me i madh se i fshehti! Provojeni perseri!");
				else
					if(nrPerdoruesi< numer)
						System.out.println("Numri qe futet eshte me i vogel se i fshehti! Provojeni perseri!");
				
			}
			
			System.out.println("Ju e gjete numrin e fshehte! Shtypni -1 per te dale nga loja ose nje numer tjeter per te vazhduar");
			nrPerdoruesi=input.nextInt();
			
		}
		
		
		
		
	}
	
	public static int randomInt()
	{
		return nrRasti.nextInt(2)+1;
	}

}
