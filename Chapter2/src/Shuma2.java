import java.util.Scanner;
public class Shuma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int nr1;
		int nr2;
		int shuma;
		
		//lajemerojme perdoruesin te fuse numrin e pare
		System.out.println("Fusni numrin e pare");
		nr1=input.nextInt();
		
		//lajmeroj perdoruesin te fuse numrin e dyte
		System.out.println("Fusni numrin e dyte");
		nr2=input.nextInt();
		
		shuma=nr1+nr2;
		
		//printo rezultatin
		System.out.printf("shuma e dy numra eshte %d", shuma);
	}

}
