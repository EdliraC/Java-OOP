
public class GradeBook2 {
	
	private String emerKursi;
	
	
	
	public void vendosEmerKursi(String kursi)
	{
		emerKursi=kursi;
	}
	
	
	public String gjejEmerKursi()
	{
		return emerKursi;
		
	}
	
	
	public void displayMessage()
	{
		System.out.printf("Mireseerdhet ne regjistrin per lenden %s \n ", gjejEmerKursi());
	}
	
	
}
