import java.util.Scanner;
public class SeparateDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
	
	//Lajmero perdoruesin te fuse numrin me 5 shifra
	System.out.print("Vendosni numrin me 5 shifra");
	int nr=input.nextInt();
	
	//gjej shifren e 10000-sheve
	int shifra1=nr/10000;
	
	int nr2=nr%10000;
	//gjej shifren e 1000-sheve
	int shifra2=nr2/1000;
	
	int nr3=nr2%1000;
	//gjej shifren e 100-sheve
	int shifra3=nr3/100;
	
	int nr4=nr3%100;
	
	//gjej shifren e 10-eve
	int shifra4=nr4/10;
	
	int nr5=nr4%10;
	
	//Afisho numrin e ndare ne shifrat e tij perberese
	
	System.out.printf("%d   %d   %d   %d   %d   ", shifra1, shifra2, shifra3, shifra4, nr5);
	

	}

}
