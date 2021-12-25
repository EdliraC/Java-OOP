import java.util.Scanner;
public class NestedInstruksioneKontrolli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		int kalimet=0;
		int moskalimet=0;
		int studente=1;
		int rezultat;
		
		while(studente<=10)
		{
			System.out.println("Fut rezultatin: 1 per kalimet dhe 2 per moskalimet");
			rezultat=input.nextInt();
			
			if(rezultat==1)
				kalimet =kalimet + 1;
			else
				moskalimet= moskalimet + 1;
			
			studente=studente + 1;
				
		}
		
		System.out.printf("Numri i kalimeve eshte %d dhe numri i moskalimeve eshte %d", kalimet, moskalimet);
		
		if(kalimet >= 8)
		
			System.out.println("Bonus per instruktorin");
			
		
		
	}

}
