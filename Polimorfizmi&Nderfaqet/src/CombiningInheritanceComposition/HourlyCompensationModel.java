package CombiningInheritanceComposition;
//HourlyCompensationModel—For Employees who are paid by the hour and receive overtime
//pay for all hours worked in excess of 40 hours per week, this class should contain
//wage and hours instance variables, and should implement method earnings based on
//the number of hours worked (see class HourlyEmployee’s earnings method in
//Fig. 10.6).
public class HourlyCompensationModel implements CompensationModel {
	
	private final double wage;
	private final int hours;
	
	public HourlyCompensationModel(double wage, int hours)
	{
		if(wage<0)
			throw new IllegalArgumentException("Vlere e palejuar per kete page orare");
		if((hours<0) || (hours >168) )
			throw new IllegalArgumentException("Vlere e palejuar per kete oret");
		
		this.wage=wage;
		this.hours=hours;
						
	}
	
	public double getWage() {return wage;}
	
	public int getHours() {return hours;}
	
	@Override
	public double earning()
	{
		if(getHours()<= 40)
			return getHours()* getWage();
		else 
			return getWage() * 40 + (40-getHours())*getWage()*1.5;
	}
	

}
