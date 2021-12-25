import java.util.Scanner;

public class WorldPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		//Vendos popullsine e botes
		System.out.println("Vendos popullsine e botes");
		long PopAktual=input.nextLong();
		
		//Vendos normen mesatare te rritjes
		System.out.println("Vendos normen e rritjes se botes");
		float normaRritjes=input.nextFloat();
		
		System.out.printf("Popullsia e botes pas nje viti do te jete: %f\n", PopAktual*(1+normaRritjes));
		System.out.printf("Popullsia e botes pas dy vitesh do te jete: %f\n", PopAktual*Math.pow((1+normaRritjes),2));
		System.out.printf("Popullsia e botes pas tre vitesh do te jete: %f\n", PopAktual*Math.pow((1+normaRritjes),3));
		System.out.printf("Popullsia e botes pas kater vitesh do te jete: %f\n", PopAktual*Math.pow((1+normaRritjes),4));
		System.out.printf("Popullsia e botes pas kater vitesh do te jete: %f\n",
				PopAktual*Math.pow((1+normaRritjes),5));


	}

}
