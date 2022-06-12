package CustomExceptionClass;
import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean loop=true;
		
		while(loop==true)
		{	
			System.out.println("Vendos emrin");
			
			String emer=in.next();
			
			System.out.println("Vendos numrin e telefonit");
			
			String nrTelefoni=in.next();
			
			try {
				Phone telefon=new Phone(emer, nrTelefoni);
								
				}
			
			catch(ValidationException ve){
				System.out.printf("Ndodhi nje gabim %s%n", ve);
			}
			
			finally {
				
			}
			
			System.out.println("\nVendos true nese do te vazhdosh perndryshe false");
			loop=in.nextBoolean();
		}
		
	}

}
