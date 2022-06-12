
public class ExceptionTest {
	
	public static void main(String [] args) throws ExceptionA
	{
		try{
			System.out.println("Metoda main krijon nje perjashtim");
			throw new ExceptionC();
			
			
		}
		
		catch(ExceptionA e)
		{
			System.err.printf("Gaabimi i ndodhur eshte %s", e);
			
			
		}
		
		finally{
			
		}
		
		
	}

}
