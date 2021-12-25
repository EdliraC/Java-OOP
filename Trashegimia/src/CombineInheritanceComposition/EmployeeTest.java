package CombineInheritanceComposition;
//In your test application, create two Employee objects—one with a CommissionCompensation-
//Model and one with a BasePlusCommissionCompensationModel—then display each Employee’s earnings.
//Next, change each Employee’s CompensationModel dynamically and redisplay each Employee’s
//earnings.
public class EmployeeTest {

	public static void main(String [] args)
	{
		//punonjesi i pare me pagese komisioni
		
		CommissionCompensationModel pageseKomision= new CommissionCompensationModel(2350, 0.02);
	
		Employee punonjes1=new Employee("Edlira", "Cani", "I4598432J", pageseKomision);
		
		//punonjesi i dyte me pagese baze dhe komisioni
		
		BasePlusCommissionCompensationModel pageseBazeKomision= new BasePlusCommissionCompensationModel(2430, 0.015, 350);
		
		Employee punonjes2= new Employee("Arben", "Hoxha", "I34567812J", pageseBazeKomision);
		
		System.out.printf("Punonjesi %s %s%.2f%n", punonjes1, "ka rrogen ", punonjes1.earnings() );
		
		System.out.printf("Punonjesi %s %s%.2f%n", punonjes2, "ka rrogen ", punonjes2.earnings() );
		
		//ndryshojme modelin e pageses se punonjesit 1, te paguhet me komision dhe rroge baze
		punonjes1.setCompensationModel(pageseBazeKomision);
		System.out.printf("%n%nPunonjesi ka ndryshuar. %s %s%.2f%n", punonjes1, "ka rrogen e re ", punonjes1.earnings() );
		
		//ndryshojme modelin e pageses per punonjesin 2, te paguhet me komision dhe jo me rroge baze
		punonjes2.setCompensationModel(pageseKomision);
		System.out.printf("%n%nPunonjesi ka ndryshuar. %s %s%.2f%n", punonjes2, "ka rrogen e re ", punonjes2.earnings() );
		
	}
	
	
}
