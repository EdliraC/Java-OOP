import java.util.Scanner;
public class GradeBookTest4 {

	public static void main(String [] args)
	{
		GradeBook4 rregjister= new GradeBook4();
		rregjister.vendosEmerKursi("Java");
		System.out.printf("Emer kursit eshte %s", rregjister.gjejEmerKursi());
		
		//kerkojme perdoruesin te percaktoje emrin e kursit
		Scanner input =new Scanner(System.in);
		System.out.println("\nVendosni emrin e kursit");
		String emer=input.nextLine();
		
		rregjister.vendosEmerKursi(emer);
		rregjister.afishoMesazhin();
		
	}
	
	
}
