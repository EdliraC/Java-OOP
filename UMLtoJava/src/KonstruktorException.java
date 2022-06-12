
public class KonstruktorException extends Exception {
	
	private String mesazh;
	
	public KonstruktorException(String m)
	{
		mesazh=m;
	}
	
	public KonstruktorException()
	{
		mesazh="Ka ndodhur nje gabim ne parametrat e konstruktorit";
	}

	@Override
	public String toString()
	{
		return mesazh;
	}
}
