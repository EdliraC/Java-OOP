package AccountsPayableModification;
//(Accounts Payable System Modification) In this exercise, we modify the accounts payable
//application of Figs. 10.11–10.14 to include the complete functionality of the payroll application of
//Figs. 10.4–10.9. The application should still process two Invoice objects, but now should process
//one object of each of the four Employee subclasses. If the object currently being processed is a Base-
//PlusCommissionEmployee, the application should increase the BasePlusCommissionEmployee’s base
//salary by 10%. Finally, the application should output the payment amount for each object.
public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payable [] detyrime =new Payable[] {
				new Invoice("01234", "seat", 2, 375),
				new Invoice("56789", "tire", 4, 759),
				new HourlyEmployee("Arben", "Hoxha","I345678J", 15.5, 47),
				new SalariedEmployee("Artur", "Caku", "I56783J", 175),
				new CommissionEmployee("Enia", "Stroka","I876544J", 2230, 0.02),
				new BasePlusCommissionEmployee("Dafina", "Kola", "I345123J", 2500, 0.02, 200)};
		
		for(Payable tePagueshme: detyrime)
		{
			System.out.println(tePagueshme);
			if(tePagueshme instanceof BasePlusCommissionEmployee)
			{
				BasePlusCommissionEmployee punonjesBaze= (BasePlusCommissionEmployee) tePagueshme;
				
				//rrit pagen me 10%
				punonjesBaze.setBaseSalary(punonjesBaze.getBaseSalary()*1.1); 
								
			}
			System.out.printf("Shuma per tu paguar eshte %.2f%n%n", tePagueshme.getPaymentAmount());
		}
		
	}

}
