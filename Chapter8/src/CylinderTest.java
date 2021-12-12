
public class CylinderTest {
	
	public static void main(String [] args)
	{
		Cylinder cilinder=new Cylinder();
		
		System.out.println(cilinder.afishoCilinder(2));
		
		Cylinder cilinder1=new Cylinder(3, 5);
		
		System.out.println(cilinder1.afishoCilinder(3));
		
		try { Cylinder cilinder2=new Cylinder(-3, -4);}
		
		catch(IllegalArgumentException e)
		{
			System.out.println("Mesazh gabimi per  krijimin e ketij cilindri "+e.getMessage());
		}
		
		
		
	}

}
