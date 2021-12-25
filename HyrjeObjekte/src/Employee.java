
public class Employee {
	
	String firstName;
	String lastName;
	double monthlySalary;
	
	
	public Employee(String name, String surname, double salary)
	{
		if (salary>0)
		 monthlySalary=salary;
		
		firstName=name;
		lastName=surname;
		
	}
	
	public void setFirstName(String name)
	{
		firstName=name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	
	public void setLastName(String surname) 
	{
		lastName=surname;
	}

	
	public String getLastName()
	{
		return lastName;
	}
	
	
	public void setMonthlySalary(double salary)
	{
		monthlySalary=monthlySalary+salary;
		
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
}
