
public class Account {
	
	private double balance;
 
 	public Account (double gjendjeFillim)
	{
		 if(gjendjeFillim> 0)
			 balance=gjendjeFillim;
	
	}
 	
 	public void kreditim(double ShDepozitim)
 	{
 		balance= balance+ShDepozitim;
 	}
 
 	public void debitim(double ShTerheq)
 	{
 		if(ShTerheq >balance)
 			System.out.println("Terheqja nuk mundet te behet");
 		
 		else
 			balance= balance -ShTerheq;
 	}

 	
 	public double gjejBalance()
 	{
 		return balance;
 	}
}
