package PayrollSystemModification;

public class PayrollCalculation {
//	
//	10.13 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include
//	private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s
//	birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//	Create an array of Employee variables to store references to the various employee objects. In a loop,
//	calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//	payroll amount if the current month is the one in which the Employee’s birthday occurs.
	
public static void main(String []args){
	 
	Employee punonjes[]= new Employee[] {
			new HourlyEmployee("Agron", "Hoxha", "I456788J",new Date(12, 01, 1986), 25, 34 ),
			new SalariedEmployee("Arben", "Gaxhi", "I4567843J", new Date(01, 21, 1983), 150 ),
			new CommissionEmployee("Mira", "Turdiu", "I76548923J", new Date(01, 23, 1979),2300, 0.015 ),
			new BasePlusCommissionEmployee("Haxhi", "Luli", "I6452653J", new Date(02, 14, 1987), 2400, 0.02, 350) };
	
	
	for( Employee CdoPunonjes: punonjes)
	
	{ //te printohen te dhenat e punonjesit
		System.out.print(CdoPunonjes);
		
		if(CdoPunonjes.getBirthdate().getMonth()==1)
		
			System.out.printf("%nPaga e ndryshuar eshte: %.2f%n%n", CdoPunonjes.earnings()+100);
		
		else
			System.out.printf("%n Paga eshte %.2f%n%n", CdoPunonjes.earnings());
		
	}


}
	
		

	}
	
	


