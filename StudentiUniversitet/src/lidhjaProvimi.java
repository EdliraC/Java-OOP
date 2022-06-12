
public class lidhjaProvimi {
	private final Studenti studenti;
	private final Kursi kursi;
	private int Nota;
	
	public lidhjaProvimi(Studenti s, Kursi k, int n)
	{
		studenti=s;
		kursi=k;
		Nota=n;
	}
	
	
	public String toString() {
		return studenti +" "+ kursi+ " "+Nota;
	}
	
}
