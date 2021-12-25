
public class AccountTest {
	
	public static void main(String[] args) {
		
		Account llogaria=new Account(15000);
		System.out.printf("Gjendja e llogarise eshte %f", llogaria.gjejBalance());
		
		llogaria.debitim(18000);
		
		System.out.printf("Gjendja e llogarise eshte %f", llogaria.gjejBalance());

	}		
}
