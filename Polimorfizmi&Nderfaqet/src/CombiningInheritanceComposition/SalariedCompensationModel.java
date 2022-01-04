package CombiningInheritanceComposition;
//SalariedCompensationModel—For Employees who are paid a fixed weekly salary, this
//class should contain a weeklySalary instance variable, and should implement method
//earnings to return the weeklySalary.
public class SalariedCompensationModel implements CompensationModel{
	
	private final double weeklySalary;
	
	public SalariedCompensationModel(double weeklySalary)
	{
		if(weeklySalary <0)
			throw new IllegalArgumentException("Vlere e palejuar per pagen javore");
		else 
			this.weeklySalary=weeklySalary;
		
	}
	
	public double getWeeklySalary(){ return weeklySalary; }
	
	@Override
	public double earning() { return getWeeklySalary(); }
	
	
}
