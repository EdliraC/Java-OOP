package EmployeeComposition;
public class BazePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		
		CommissionEmployee punonjesMeKomision=new CommissionEmployee("Edlira", "Cani", "123456789", 600,0.02);
		//krijojme nje punonjes me page baze
		BasePlusCommissionEmployee punonjesMeBaze=
				new BasePlusCommissionEmployee(punonjesMeKomision, 300);
		System.out.printf("Emri , Mbiemri i Punonjesit%n%s\t%s%n", punonjesMeBaze.gjejEmrin(),punonjesMeBaze.gjejMbiemrin());
		
		System.out.printf("Numri i Sigurimeve eshte %s%n", punonjesMeBaze.gjejSSN());
		System.out.printf("Shitjet Bruto qe ka realizuar: %.2f%n", punonjesMeBaze.gjejShitjetBruto());
	
		System.out.printf("Norma e komisionit eshte %.2f%n", punonjesMeBaze.gjejKomision());
		System.out.printf("Paga Baze e ketij punonjesi eshte %.2f%n", punonjesMeBaze.gjejPageBaze());
		
		System.out.printf("Sa eshte rroga e ketij punonjesi? %.2f%n", punonjesMeBaze.gjejRrogen());
		System.out.printf("Nese nuk ka page baze, ky punonjes ka rrogen %.2f%n", punonjesMeKomision.earnings());
		
		punonjesMeBaze.vendosPageBaze(350);
		System.out.println(punonjesMeBaze);
		System.out.println(punonjesMeBaze.gjejRrogen());
		
		
		

	}

}
