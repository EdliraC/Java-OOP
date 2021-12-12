import java.util.Scanner;

public class GradeBookFirst {
	
	private String emerKursi;
	int numerNota=0;
	float totalNota=0;
	int Anumrator;
	int Bnumrator;
	int Cnumrator;
	int Dnumrator;
	int Fnumrator;
	
//	klasa do te kete metodat e saj baze qe jane
//	konstruktori
	public GradeBookFirst(String kursi)
	{
		emerKursi=kursi;
	}
//	vendosEmerKursi
	public void vendosEmerKursi(String kursi)
	{
		emerKursi=kursi;
	}
	
//	gjejEmerKursi
	public String gjejEmerKursi()
	{
		return emerKursi;
		
	}
//	afishoMesazhin
	
	public void afishoMesazhin()
	{
		System.out.printf("Mireserdhet ne kursin %s\n", gjejEmerKursi());
	}
	
//	dhe metoden qe lejon perdoruesin te fuse notat

	public void vendosNotat()
	{
		//metoda do te lejoje perdoruesin te fuse notat ose -1 per te perfunduar
		
		System.out.println("Fut noten e studentit nga 0-100 ose -1 per te perfunduar");
		
		Scanner input =new Scanner(System.in);
		
		float nota= input.nextFloat();
	
		
		while(nota != -1)
		{
			//duhet te numerohet nota, dhe te shumohen qe te mund te gjejme mesataren 
			numerNota++;
			totalNota+=nota;
			
			numeroNotenSipasGermave(nota);
			//te fuse perdoruesi noten tjeter
			//gjithashtu duhet te gjendet germa te ciles i perket dhe te inkrementohet numratori i germes
			
			System.out.println("Fut noten e studentit nga 0-100 ose -1 per te perfunduar");
			
			input =new Scanner(System.in);
			
			nota= input.nextFloat();
			
		}
		
	}
	
//	metoden qe numeron notat sipas shkronjave A, B, C, D, F
	
	private void numeroNotenSipasGermave(float nota)
	{	
		switch((int)nota/10)
		{
		case 10: 
		case 9://nota midis 90-100
			Anumrator++;
			break;
			
		case 8://nota midis 80-89
			Bnumrator++;
			break;
		
		case 7://nota midis 70-79
			Cnumrator++;
			break;
		
		case 6://nota midis 60-69
			Dnumrator++;
			break;
			
		default://nota midis 50-59
			Fnumrator++;
			break;
		}
			
			
		
	}//mbyllet metoda numeroNotenSipasGermave()
	
	
//	dhe metoden qe printon raportin e kerkuar nga perdoruesi me totalin e notave, numrin e tyre dhe mesataren 
//	dhe gjithashtu me notat sipas germave.
	
	public void afishoRaportin() 
	{
		System.out.println("Raporti i Notave\n");
		
		if(numerNota!=0)
		{
			float mesatare=totalNota/numerNota;
			
			System.out.printf("Ju keni futur %d nota me shumen %.2f.\n Mesatarja e tyre eshte %.2f .\n Numri  notave "
					+ "per secilen germe eshte si me poshte:\n A: %d\n B: %d\n C: %d\n D: %d\n F: %d\n ", 
					numerNota, totalNota, mesatare, Anumrator, Bnumrator, Cnumrator, Dnumrator, Fnumrator);
			
		}
		else 
			System.out.println("Asnje note e futur nga ju!");
	}
	
	
	

}
