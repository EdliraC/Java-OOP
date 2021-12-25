package CombineInheritanceComposition;

public class BasePlusCommissionCompensationModel extends CompensationModel{
	
	private double grossSales;
	private double commissionSales;
	private double baseSalary;
	
	public BasePlusCommissionCompensationModel(double grossSales, double commissionSales, double baseSalary)
	{
		this.grossSales=grossSales;
		this.commissionSales=commissionSales;
		this.baseSalary=baseSalary;
	}
	
	@Override
	public double earnings()
	{
		return grossSales*commissionSales + baseSalary;
	}
	

}
