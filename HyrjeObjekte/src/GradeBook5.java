
public class GradeBook5 {

	private String emerKursi;
	
	public GradeBook5(String emer)
	{
		emerKursi=emer;
		
	}
	
	public void vendosKursin(String kursi)
	{
		emerKursi=kursi;	
	}
	
	public String gjejKursin()
	{
		return emerKursi;
		
	}
	
	public void afishoMesazh()
	{
		System.out.printf("\nMireseerdhet ne rregjistrin per kursin %s", gjejKursin());
	}
}
