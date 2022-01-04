package CombiningInheritanceComposition;
//In your test application, create Employee objects with each of the CompensationModels
//described above, then display each Employee’s earnings. Next, change each Employee’s CompensationModel
//dynamically and redisplay each Employee’s earnings.
public class CompensationModelInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] punonjesTeNdryshem= new Employee [] { 
				new Employee("Arben", "Hoxha", "I23456J", new HourlyCompensationModel(15, 45)),
				new Employee("Edra", "Guri", "I654321J", new SalariedCompensationModel(250)),
				new Employee("Zoi", "Fjolla", "I234567J", new CommissionCompensationModel(1230, 0.02)),
				new Employee("Zeta", "Coshi", "I234567J", new BasePlusCommissionCompensationModel(1350, 0.023, 340))
				};
		
		for (Employee cdoPunonjes: punonjesTeNdryshem)
		{
			System.out.println(cdoPunonjes);
			System.out.printf("Rroga eshte: %.2f%n%n", cdoPunonjes.earning());
		}
				 
		}
		
		
		
	}


