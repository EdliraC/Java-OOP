import java.util.Scanner;

public class GradeBookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
	GradeBook myGradeBook= new GradeBook();
	
	System.out.println("Vendosni emrin e kursit:");
	String EmerKursi=input.nextLine();
	System.out.println();
	
	myGradeBook.displayMessage(EmerKursi);
	
	
	}

}
