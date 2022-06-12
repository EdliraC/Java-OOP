package CustomExceptionClass;

public class ValidationException extends RuntimeException{
	
	private static String mesazh;
	
	public ValidationException(String mesazh)
	{
		super(mesazh);
	}
	

}
