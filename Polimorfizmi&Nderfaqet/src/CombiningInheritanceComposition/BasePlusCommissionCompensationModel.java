package CombiningInheritanceComposition;
//d) BasePlusCommissionCompensationModel—For Employees who are paid a base salary
//and commission, this class should contain instance variables grossSales, commission-
//Rate and baseSalary and should implement earnings to return baseSalary + gross-
//Sales * commissionRate.
public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
	
	private final double baseSalary;
	
	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary)
	{
		super(grossSales, commissionRate);
		
		if(baseSalary<0)
			throw new IllegalArgumentException("Vlere e palejuar");
		this.baseSalary=baseSalary;
	}
	
	
	public double getBaseSalary() {return baseSalary;}
	
	@Override
	public double earning()
	{
		return super.earning()+ getBaseSalary();
	}
	

}
