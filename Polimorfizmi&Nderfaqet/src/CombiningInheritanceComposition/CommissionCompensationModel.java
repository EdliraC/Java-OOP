package CombiningInheritanceComposition;
//CommissionCompensationModel—For Employees who are paid by commission, this class
//should contain grossSales and commissionRate instance variables, and should implement
//method earnings to return grossSales * commissionRate.
public class CommissionCompensationModel implements CompensationModel {

	private final double grossSales;
	private final double commissionRate;
	
	public CommissionCompensationModel(double grossSales, double commissionRate)
	{
		if(grossSales< 0)
			throw new IllegalArgumentException("Vlere e palejuar per shitjet");
		
		if(commissionRate<0|| commissionRate>1)
			throw new IllegalArgumentException("Vlere e palejuar per perqindjen e komisionit");
		
		this.commissionRate=commissionRate;
		this.grossSales=grossSales;
	}
	
	public double getGrossSales() {return grossSales;}
	public double getCommissionRate() { return commissionRate; }
	
	@Override
	public double earning()
	{
		return getGrossSales()* getCommissionRate();
	}
	
}
