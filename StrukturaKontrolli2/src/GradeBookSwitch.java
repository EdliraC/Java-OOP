import javax.swing.JOptionPane;
public class GradeBookSwitch {

	private String courseName;
	
	private int grade;
	private int gradeCounter;
	private int gradeTotal;
	
	//numeratori per cdo note
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;
	
	public GradeBookSwitch(String name)
	{
		courseName=name;
	}
	
	
	public void setCourseName(String name)
	{
		courseName=name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	
	public String displayMessage()
	{
		return String.format("Mireserdhet ne rregjistrin e kursit %s\n\n", getCourseName());
		 
	}
	
	
	public void inputGrades()
	{
		String notaStr=JOptionPane.showInputDialog(null, "Vendosni noten e studentit ne intervalin 0-100 ose -1 per te perfunduar");
		grade= Integer.parseInt(notaStr);
		
			while(grade!= -1)
			{
				
				gradeTotal=gradeTotal+ grade;
				++gradeCounter;
				
				incrementLetterGradeCounter(grade);
				
				notaStr=JOptionPane.showInputDialog(null, "Vendosni noten e studentit ne intervalin 0-100 ose -1 per te perfunduar");
				grade= Integer.parseInt(notaStr);
			}
		
	}
	
	public void incrementLetterGradeCounter(int grade)
	{
		
		//numerojme notat me germa
		switch(grade/10)
		{
			case 10:
			case 9:
				++aCount;
				break;
				
			case 8: ++bCount;
					break;
					
			case 7:++cCount;
					break;
					
			case 6: ++dCount;
					break;
			
			default: ++fCount;
					break;
					
		}
	}
	
	public void displayGradeReport()
	{
		if(gradeCounter!=0)
		{
			JOptionPane.showMessageDialog(null, "Ky eshte raporti i notave te futura:\n");
					
			String mesazh=String.format("Ju keni futur %d nota dhe totali i tyre eshte %d", gradeCounter, gradeTotal);
			JOptionPane.showMessageDialog(null, mesazh);
			
			mesazh=String.format("Mesatarja e notave eshte %.2f	\n", (float)gradeTotal/gradeCounter);
			JOptionPane.showMessageDialog(null, mesazh);
			
			mesazh=String.format("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
					"Numri i studenteve te vleresuar sipas notave jane:", 
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
			JOptionPane.showMessageDialog(null, mesazh);
		
		}	
		else 
			JOptionPane.showMessageDialog(null, "JU nuk keni futur ndonje note");
	}
	
}
