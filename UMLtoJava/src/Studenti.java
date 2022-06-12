import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Calendar;
public class Studenti {
	
	private final String emer;
	private final String mbiemer;
	private final String NrMatrikullimi;
	private final Date ditelindje;
	private int mosha;
	private ProgramStudimi rregjistruarNe;
	private HashSet<Kurs> merrKurset;
	
	public Studenti(String e, String m, String nrM, int mosha, Date d)
	{
		if((nrM==null)||(nrM.isEmpty()))
				throw new ImputMismatchException(this + "nuk ka numer matrikullimi");
		emer=e;
		mbiemer=m;
		NrMatrikullimi=nrM;
		this.mosha=mosha;
		ditelindje=d;
		rregjistruarNe=new ProgramStudimi();
		merrKurset=new HashSet<Kurs>();
		
				
	}
	
	public void vendosProgramStudimi(ProgramStudimi ps) { rregjistruarNe=ps;}
	public ProgramStudimi gjejProgramStudimi() { return rregjistruarNe; }
	
	public String toString()
	{
		return emer+ " "+ mbiemer + " "+NrMatrikullimi+ " "+ mosha+" "; 
	}

	public void llogaritMoshen()
	{
		mosha= Calendar.YEAR-ditelindje.getYear();
	}
	
	public void vendosKurse(Kurs k)
	{
		if(k!=null)
			merrKurset.add(k);
	}
	
	public void heqKurse(Kurs k)
	{
		if(k!=null)
			merrKurset.remove(k);
	}
	
	public Set<Kurs> gjejKurset()
	{
		return (HashSet<Kurs>)merrKurset.clone();
	}
}
