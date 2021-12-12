import java.util.Scanner;
public class CarPoolCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//Te fuse perdoruesi te dhenat per tu llogaritur
		System.out.println("Vendos Cmimin e karburantit per liter");
		float cmimKarburant=input.nextFloat();
		
		System.out.println("Vendos Liter per KM");
		float LiterKM=input.nextFloat();
		
		System.out.println("Vendos totalin e KM te pershkuar");
		float TotalKm=input.nextFloat();
		
		System.out.println("Vendos Tarifen e Parkimit");
		float TarifParkimi=input.nextFloat();
		
		System.out.println("Vendos Tarifa te tjera");
		float TarifaTjera=input.nextFloat();
		
		float TotalKosto=TotalKm* LiterKM * cmimKarburant + TarifParkimi+ TarifaTjera;
		
		System.out.printf("Ju keni kursyer %f ALL duke perdorur makine te perbashket", TotalKosto);
		
		
		
		

	}

}
