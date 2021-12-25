
public class GradeBook6 {

	private String emerKursi;
	private String emerInstruktori;
	
	public GradeBook6(String kursi, String instruktori)
	{
		emerKursi=kursi;
		emerInstruktori=instruktori;
		
	}
	
	public void vendosInstruktor(String emerI)
	{
		emerInstruktori=emerI;
	}
	
	public void vendosKursin(String lenda)
	{
		emerKursi=lenda;
	}
	
	public String gjejInstruktor()
	{
		return emerInstruktori;
	}
	
	public String gjejKursi()
	{
		return emerKursi;
	}
	
	
	
	public void afishoMesazhin()
	{
		System.out.printf("Mireserdhet ne regjister per kursin %s", gjejKursi());
		System.out.printf("\nKy kurs eshte i prezantuar nga %s", gjejInstruktor());
	}
}
