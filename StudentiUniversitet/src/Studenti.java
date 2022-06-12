import java.util.Date;
import java.util.HashSet;
public class Studenti {
	private final String Emer;
	private final String mbiemer;
	private final String NrMatrikullimi;
	private  ProgramStudimi rregjistruarNe;
	private int mosha;
	private final Date ditelindja;
	private lidhjaProvimi lidhjaP;
//	private HashSet<Kursi> merrKursin;
//	private int Nota;
	public Studenti(String e, String m, String nrM, int mos, Date d)
	{
		if(!nrM.isEmpty())
			throw new ArithmeticException("Nuk eshte percaktuar numri i matrikullimit per studentit");
		
		Emer=e;
		mbiemer=m;
		NrMatrikullimi=nrM;
		mosha=mos;
		ditelindja=d;
		rregjistruarNe=new ProgramStudimi();
//		merrKursin=new HashSet<Kursi>();
//		Nota=0;
	}
	
//	public void rregjistroNeKurs(Kursi k, int n)
//	{	
//		if(k!=null)
//		{
//				merrKursin.add(k);
//				Nota=n;
//		}
//				
//		
//	}
	
//	public void vendosNoten(Kursi k, int n)
//	{
//		if(k!=null)
//			Nota=n;
//	}
	
	
//	public void fshijNoten(Kursi k)
//	{
//		if(k!=null)
//			Nota=0;
//		
//	}
	
	
//	public void hiqKursin(Kursi k)
//	{
//		if(k!=null)
//		merrKursin.remove(k);
//	}
	
//	public HashSet<Kursi> gjejKursin()
//	{
//		return (HashSet<Kursi>)merrKursin.clone();
//	}
	
	public void vendosProgramStudimi( ProgramStudimi p )
	{
		rregjistruarNe=p;
	}
	public String gjejEmerMbiemer()
	{
		return Emer+ " "+ mbiemer;
	}
	
	public int gjejMoshen()
	{
		return mosha;
	}
	
	@Override 
	public String toString()
	{
		return Emer+ " "+mbiemer+" "+NrMatrikullimi+" "+ mosha+" "+ditelindja;
	}
	
}
