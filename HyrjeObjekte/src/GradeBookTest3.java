import java.util.Scanner;
public class GradeBookTest3 {

	public static void main(String[] args) {
		// perdoren dy objekte
		
		Scanner input = new Scanner(System.in);
		
		GradeBook2 regjistriIm= new GradeBook2();
		
		System.out.printf("Emri i paracaktuar i kursit eshte %s \n", regjistriIm.gjejEmerKursi());
		
		System.out.println("Ju lutem vendosni emrin e kursit:");
		
		String emriKurs=input.nextLine();
		regjistriIm.vendosEmerKursi(emriKurs);
		
		regjistriIm.displayMessage();
		
	}

}
