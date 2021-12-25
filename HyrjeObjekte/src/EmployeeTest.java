
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee punonjes1=new Employee("Edlira", "Cani", 4500.35);
		System.out.printf("Rroga juaj mujore eshte %.2f \n dhe ajo vjetore eshte %.2f \n", punonjes1.getMonthlySalary(), punonjes1.getMonthlySalary()*12);

		//Vendos nje rritje rroge prej 10% per punonjesin
		
		punonjes1.setMonthlySalary(punonjes1.getMonthlySalary()*0.1);
		//Afishoj rrogen e re mujore
		System.out.printf("Rroga juaj mujore eshte rritur ne nivelin e ri %.2f\n", punonjes1.getMonthlySalary());
		//Afishoj rrogen e re vjetore
		System.out.printf("Rroga juaj vjetore %.2f", punonjes1.getMonthlySalary()*12);
	}

}
