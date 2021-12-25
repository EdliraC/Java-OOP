
public class GradeBookSwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeBookSwitch gradeBookTest= new GradeBookSwitch("Hyrje ne Java");
		//afisho mesazhin e mireseardhjes
		gradeBookTest.displayMessage();
		
		//perdoruesi te fuse notat
		gradeBookTest.inputGrades();
		
		//perdoruesi te marre raportin e notave
		gradeBookTest.displayGradeReport();
		
	}

}
