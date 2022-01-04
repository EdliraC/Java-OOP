package CombiningInheritanceComposition;


public class Employee {

	//The common attributes and behaviors for all Employees are firstName, lastName,
	//socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of
	//method toString. Create a new superclass Employee that contains these instance variables and methods
	//and a constructor.
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private CompensationModel modelRroge;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel modelRroge)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.modelRroge=modelRroge;
	}
	
	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public String getSocialSecurityNumber() {return socialSecurityNumber;}
	
	public void setCompensationModel(CompensationModel modelRroge)
	{
		this.modelRroge=modelRroge;
	}
	
	
	public double earning()
	{
		return modelRroge.earning();
	}
	
	@Override
	public String toString()
	{
		return String.format("Punonjesi eshte %n%s %s%nSSN%s%nModel rroge%s", getFirstName(), getLastName(), getSocialSecurityNumber(), modelRroge.getClass().getName());
	}
}
