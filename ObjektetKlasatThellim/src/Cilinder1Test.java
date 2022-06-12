
public class Cilinder1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a vlera te fushave
		Cylinder1 c1=new Cylinder1();
		System.out.println(c1);
		
		//test 2, do t'i percaktojma parametrat e cilindrit
		Cylinder1 c2=new Cylinder1(3, 4);
		System.out.println(c2);
		
		//test 3, fusim parametra negative
		try{
			Cylinder1 c3=new Cylinder1(-3, -4);
			}
		
		catch( IllegalArgumentException error)
		{
			System.out.println("MEsazh gabimi"+error);
		}
			
		
	 
	try 
	{ c2.setHeight(5);
	
	}
	
	catch( IllegalArgumentException error)
	{
		System.out.println("MEsazh gabimi"+error);
	}
	
	System.out.println(c2.calculateVolume());
	System.out.println(c2);
		
	}
		
		
	}


