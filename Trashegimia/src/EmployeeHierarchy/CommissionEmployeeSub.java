package EmployeeHierarchy;
//Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Employee. 
//Class CommissionEmployee should contain only the instance variables and methods that are
//not declared in superclass Employee. Class CommissionEmployee’s constructor should invoke class Employee’s
//constructor, and CommissionEmployee’s toString method should invoke Employee’s toString method. 
//Once you’ve completed these modifications, run the CommissionEmployeeTest and
//BasePlusCommissionEmployeeTest apps using these new classes to ensure that the apps still display the
//same results for a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.

public class CommissionEmployeeSub extends Employee{
	
	private double grossSales;      
	private double commissionRate;
	
	public CommissionEmployeeSub(String firstName, String lastName, String socialSecurityNumber, double grossSales, double CommissionRate)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if(grossSales<0)
		{
			 throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		
		if((CommissionRate<0) && (CommissionRate >1))
		{
			throw new IllegalArgumentException("Commission Rate must be between 0 and 1");
		}
		
		
		this.grossSales=grossSales;
		this.commissionRate=CommissionRate;
		
	}
	
	public double getSales() {return grossSales; }
	public double getCommissionRate() {return commissionRate; }
	//per tu shtuar dhe metodat te  cilat ndryshojne vleren e ketyre variablave
	
	public double earnings()
	{
		return grossSales*commissionRate;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%nShitjet Bruto: %.2f, Norma Komisionit: %.2f%nPaga %.2f", super.toString(), getSales(), getCommissionRate(), earnings());
	}

}
