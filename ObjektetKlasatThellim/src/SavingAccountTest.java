import java.util.Scanner;
public class SavingAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		SavingAccount saver1=new SavingAccount(2000);
		
		SavingAccount saver2=new SavingAccount(3000);
//		System.out.println("Fut normen e interesit");
//		
//		Scanner input=new Scanner(System.in);
//		
//		
//		try { SavingAccount.modifyInterestRate(input.nextDouble()); }
//		catch(IllegalArgumentException error)
//		{
//			System.out.println("Mesazh gabimi "+error.getMessage());
//		}
		
		
		try { SavingAccount.modifyInterestRate(0.04); }
		catch(IllegalArgumentException error)
		{
			System.out.println("Mesazh gabimi "+error.getMessage());
		}
		
		
		System.out.println("Saver1");
		
		for(int month=1; month<=12; month++)
		{
			System.out.printf("%d   %.2f     %.2f%n", month, saver1.calculateMonthlyInterest(), saver1.getBalance());
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Saver2");
		
		for(int month=1; month<=12; month++)
		{
			System.out.printf("%d   %.2f     %.2f%n", month, saver2.calculateMonthlyInterest(), saver2.getBalance());
		}
		
		
		try { SavingAccount.modifyInterestRate(0.05); }
		catch(IllegalArgumentException error)
		{
			System.out.println("Mesazh gabimi "+error.getMessage());
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.printf("Saver1 %n 1    %.2f    %.2f%n", saver1.calculateMonthlyInterest(), saver1.getBalance() );
		
		System.out.printf("Saver2 %n 1    %.2f    %.2f", saver2.calculateMonthlyInterest(), saver2.getBalance() );
		
	}

}
