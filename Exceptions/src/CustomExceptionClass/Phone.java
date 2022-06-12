package CustomExceptionClass;

public class Phone {
	
	private String name;
	private String serialNumber;
	
	public Phone(String name, String serialNumber) throws ValidationException
	{
		if((name==null)||(serialNumber==null)||(serialNumber.length()<16))
		throw new ValidationException("Vlera te pavlefshme per Name, Serial Number");
		
		else
		{
			this.name=name;
			this.serialNumber=serialNumber;
		}	
	}
	
	@Override
	public String toString()
	{
		return String.format("Telefoni i krijuar ka emer %s dhe numer %s", name, serialNumber);
	}

}
