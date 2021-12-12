import java.util.Scanner;

public class RregjisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rregjister rregjisterKursiJava= new Rregjister();
			
		
		//krijoj objektin Scanner
		Scanner input=new Scanner(System.in);
		
		System.out.println("Fut emrin e kursit");
		String Kursi=input.nextLine();
		
		rregjisterKursiJava.vendosEmerKursi(Kursi);
		
		rregjisterKursiJava.afishoMesazhMireseardhje();
	
			}

}
