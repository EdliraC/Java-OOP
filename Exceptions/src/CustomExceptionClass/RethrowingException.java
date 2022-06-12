package CustomExceptionClass;

public class RethrowingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			someMethod();
		
		}
		catch(Exception e)
		{
			System.err.println("Exception caught in main.");
			e.printStackTrace();
			StackTraceElement[] perjashtime=e.getStackTrace();
			for(StackTraceElement njePerjashtim:perjashtime)
			{
				System.out.printf("%n%s\t", njePerjashtim.getClassName());
				System.out.printf("%s\t", njePerjashtim.getFileName());
				System.out.printf("%s\t", njePerjashtim.getLineNumber());
				System.out.printf("%s", njePerjashtim.getMethodName());
			}
		}
	}
	
	public static void someMethod()  throws Exception{
		try {
			someMethod2();
			
		}
		catch(Exception e){
			System.err.printf("Exception caught. View message %s", e);
			throw e;
		}
		finally
		{
			
		}
		
	}
	
	public static void someMethod2() throws Exception{
					
			throw new Exception();
		
		
		
	}

}
