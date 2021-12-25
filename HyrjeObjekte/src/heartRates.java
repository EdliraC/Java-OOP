import java.util.Date;

public class heartRates {
	
	String firstName;
	String lastName;
	int day;
	int month;
	int year;
	
	
	public heartRates( String name, String surname, int dayBirth, int monthBirth, int yearBirth)
	{
		firstName=name;
		lastName=surname;
		day =dayBirth;
		month=monthBirth;
		year=yearBirth;
		
			
	}
	
	public void setName(String name)
	{
		firstName=name;
	}
	
	public String getName()
	{
		return firstName;
	}
	
	public void setSurname(String surname)
	{
		lastName=surname;
	}
	
	public String getSurname()
	{
		return lastName;
	}
	
	public int getYearBirth()
	{
		return year;
	}
	
	public void setYearBirth(int yearBirth)
	{
		year=yearBirth;
	}
	
	public int ageCalc()
	{
		Date data=new Date();
		int age= (data.getYear()+1900)-year;
		return age;
	}
	
}
