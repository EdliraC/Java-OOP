package EmployeeComposition;
public class BasePlusCommissionEmployee {
	
	private CommissionEmployee punonjesKomision;
	private double pageBaze;
	
	
	public BasePlusCommissionEmployee(CommissionEmployee punonjesKomision, double pageBaze)
	{
		if(pageBaze<=0)
			{
				throw new IllegalArgumentException("paga baze duhet te jete me e madhe se 0");
			}
		
		this.punonjesKomision=punonjesKomision;
		this.pageBaze=pageBaze;
		
	}
	
	public String gjejEmrin()
	{
		return punonjesKomision.getFirstName();
	}
	
	public String gjejMbiemrin()
	{
		return punonjesKomision.getLastName();
	}
	
	
	public String gjejSSN()
	{
		return punonjesKomision.getSocialSecurityNumber();
	}
	
	
	public double gjejShitjetBruto()
	{
		return punonjesKomision.getGrossSales();
	}
	
	
	
	public void vendosShitjetBruto(double shitjet)
	{
		if(shitjet<=0)
		{
			throw new IllegalArgumentException("Vlere e palejuar per shitjet, duhet >0");
		}
		
		punonjesKomision.setGrossSales(shitjet);
	}
	
	
	public double gjejKomision()
	{
		return punonjesKomision.getCommissionRate();
	}
	
	
	public void vendosKomision(double komision)
	{
		if((komision<=0)||(komision>1))
		{
			throw new IllegalArgumentException("Vlere e palejuar per komisionin, duhet >0 dhe <1");
		}
		
		punonjesKomision.setCommissionRate(komision);
	}
	
	public double gjejPageBaze()

	{
		return pageBaze;
	}
	
	
	public void vendosPageBaze(double pageBaze)
	{
		if(pageBaze <0)
		{
			throw new IllegalArgumentException("Vlere e palejuar per pagen baze, duhet >0");
			
		}
		
		this.pageBaze=pageBaze;
	}
	
	
	public double gjejRrogen()
	{
		return pageBaze+ punonjesKomision.earnings();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s%.2f", punonjesKomision,"Page Baze: ",gjejPageBaze()  );
	}
}
