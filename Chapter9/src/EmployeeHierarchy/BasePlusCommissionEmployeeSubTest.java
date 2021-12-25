package EmployeeHierarchy;
public class BasePlusCommissionEmployeeSubTest {
   public static void main(String[] args) {
      // instantiate BasePlusCommissionEmployee object
	   
	   CommissionEmployeeSub punonjes= new CommissionEmployeeSub("Brian", "Levingthon", "333-44-3536", 2300, 0.03);
	   
	   System.out.printf("%n%s:%n%n%s%n", 
		         "Updated employee information obtained by toString", 
		          punonjes.toString());
	   
      BasePlusCommissionEmployeeSub employee =             
         new BasePlusCommissionEmployeeSub("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      
      
   System.out.println(employee.getFirstName());
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
          employee.toString());
   } 
} 
