
public class ProgramStudimi {
	private final String Kodi;
	private final String Emer;
	
	public ProgramStudimi(String k, String e)
	{
		Kodi=k;
		Emer=e;
	}
	
	public ProgramStudimi()

	{
		Kodi=null;
		Emer=null;
	}
	public String gjejKodiProgramit()

	{
		return Kodi;
	
	}
	
	public String gjejEmerProgrami()
	{
		return Emer;
	}
}

