

public class SavingAccount {
	
	public static double annualInterestRate;
	private double savingBalance;
	
	
	 
	public SavingAccount(double initialBalance)
	{
		if(initialBalance<0)
			throw new IllegalArgumentException("Vendosni nje balance fillestare 0 ose pozitive");
		else
			savingBalance=initialBalance;
		
	}
	
	public static void modifyInterestRate( double i)
	{
		if((i<0) || (i>1))
			throw new IllegalArgumentException("Vendosni nje interes ndermjet 0 dhe 1");
		else
			annualInterestRate=i;
	}
	
	public static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public double getBalance() 
	{
		return savingBalance;
	}
	
	
	public double calculateMonthlyInterest()
	{
		double monthlyInterest= getBalance() * getAnnualInterestRate()/12;
		
		savingBalance=getBalance()+monthlyInterest;
		
		return monthlyInterest;
	}
	
	

}
