import java.util.Scanner;
public class CountPos_Neg_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	int UserControl=0;
	int countPos=0; 
	int countNeg=0;
	int countZero=0;
	
	while(UserControl!=1)
	{
		//Lajmero perdoruesin te fuse numrin
		System.out.println("Vendosni numrin");
		int nr=input.nextInt();
		
		//Kontrollo nese eshte negativ, pozitiv apo zero
		if(nr>0)
			countPos++;
		else 
			if(nr<0)
				countNeg++;
			else
				countZero++;
		
		//A do te vazhdoje perdoruesi
		System.out.println("A do te vazhdoni? Vendosni 1 per te ndaluar ose tjeter per te vazhduar ");
		UserControl=input.nextInt();	
		
				}
		
	//Printojme rezultatet
	System.out.printf("Numra pozitive jane %d, numra negative jane %d ndersa numra Zero jane %d", countPos, countNeg, countZero);

	}

}
