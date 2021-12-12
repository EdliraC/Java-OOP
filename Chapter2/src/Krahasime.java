import java.util.Scanner;
public class Krahasime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int nr1;
		int nr2;
		//lajmerojme perdoruesin te fuse numrin e pare
		System.out.println("Fusni numrin e pare");
		nr1=input.nextInt();
		
		//lajmerojme perdoruesin te fuse numrin e dyte
		System.out.println("Fusni numrin e dyte");
		nr2=input.nextInt();
		
		if(nr1>nr2)
			System.out.printf("%d>%d",nr1,nr2  );
		else 
			if(nr1<nr2)
				System.out.printf("%d<%d",nr1,nr2  );
		
	}

}
