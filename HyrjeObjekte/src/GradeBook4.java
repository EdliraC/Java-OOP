
public class GradeBook4 {

	private String emerKursi;
	
	public String gjejEmerKursi()
	{
		return emerKursi;
	}	


	public void vendosEmerKursi(String kursi)
	{
		emerKursi=kursi;
	}

	public void afishoMesazhin()
	{
		System.out.printf("Mireserdhet ne rregjister dhe lenda eshte %s", gjejEmerKursi());
		
	}

}
