
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Krijoj nje fature
		Invoice fature= new Invoice("12DE", "Keyboard", 2, 2350);
		System.out.printf("Ju keni blere %s %d cope\n me cmimin secila %.2f", fature.getPartDesc()
				,fature.getItemQuantity(), fature.getPrice());
		System.out.printf("\nJu keni per te paguar %.2f", fature.getInvoiceAmount());

	}

}
