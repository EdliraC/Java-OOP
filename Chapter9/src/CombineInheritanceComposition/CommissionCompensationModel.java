package CombineInheritanceComposition;

public class CommissionCompensationModel extends CompensationModel{
	
	private double grossSales;
	private double commissionSales;
	
	
	public CommissionCompensationModel(double grossSales, double commissionSales)
	{
		this.grossSales=grossSales;
		this.commissionSales=commissionSales;
	}
	
	@Override
	public double earnings()
	{
		return grossSales*commissionSales;
	}
	


}
