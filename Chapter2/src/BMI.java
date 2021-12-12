import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//perdoruesi fut peshen
		System.out.println("Vendos peshen ne Kilogram");
		 float peshaKg= input.nextFloat();
		
		//perdoruesi fut gjatesine ne metra
		 System.out.println("Vendosni gjatesine ne metra");
		 float gjatesiM=input.nextFloat();
		 
		//llogarit BMI
		 
		 float BMI=peshaKg/(gjatesiM* gjatesiM);
		 
		 System.out.printf("BMI juaj eshte %f \n", BMI);
		 
		 
		 System.out.println("BMI Values");
		 System.out.println("Underweight: less than 18.5");
		 System.out.println("Normal: between 18.5 and 24.9");
		 System.out.println("Overweight: between 25 and 29.9");
		 System.out.println("Obese: 30 or greater");
	}

}
