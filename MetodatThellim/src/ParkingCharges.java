//(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
//hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//customer. The program should display the charge for the current customer and should calculate and
//display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge 
//for each customer






import javax.swing.JOptionPane;


public class ParkingCharges {
	
	private static float oreParkimi=0;
	private static float tarifeParkimi=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//programi duhet te lejoje te llogaritet tarifa e parkimit  per nje klient dhe per gjithe klientet ne total
		// pra nje metode duhet te mundesoje rrejgistrimin e oreve per cdo klient dhe te llogarise totalin e gjithe klienteve
		float totalTarifaParkimi=0;
		String mesazh;
		
		String input=JOptionPane.showInputDialog("Hidhni numrin e oreve ne parkim per klientin ose -1 per te perfunduar\n");
		oreParkimi=Float.parseFloat(input);
		
		// perdoruesi te lajmerohet per te rregjistruar oret e nje klienti ose per te perfunduar hedhjen e oreve me -1
				// per aq kohe sa nuk eshte rregjistruar -1 
		while(oreParkimi!=-1)
		{
			//te merret numri i oreve te kaluara ne parkim qe duhet te jete me i vogel se 24
			// te llogaritet tarifa e parkimit duke thirrur metoden e dyte qe kryen kete funksion
			//te mblidhet tarifa e parkimit tek nje totale	
			 if(oreParkimi>24)
				 JOptionPane.showMessageDialog(null, "Keni futur me shume se 24 ore");
			 else
				 tarifeParkimi=llogaritTarifen(oreParkimi);
			 	totalTarifaParkimi+=tarifeParkimi;
			 
			 	mesazh=String.format("Tarifa e Parkimit per kete klient eshte %f", tarifeParkimi);
			 	JOptionPane.showMessageDialog(null, mesazh);
				
			 	input=JOptionPane.showInputDialog("Hidhni numrin e oreve ne parkim per klientin ose -1 per te perfunduar\n");
				oreParkimi=Float.parseFloat(input);
			
		}
		
		mesazh=String.format("Totali i tarifave te parkimit te llogaritura deri me tani eshte %f", totalTarifaParkimi);
		JOptionPane.showMessageDialog(null, mesazh);
		
	}//fundi i metodes main
	
	//nje metode tjeter duhet te llogarise tarifen e parkimit per cdo klient ne varesi te oreve te futur nga perdoruesi
	//nese oret jane <=3 ath tarifa e parkimit eshte 2*nr e oreve
	// nese orete jane >3 ath tarifa eshte 2*3+0.5*(nr oreve-3)
	//nese tarifa>10 athere tarifa=10
	//metoda duhet te ktheje tarifen e llogaritur
	
	public static float llogaritTarifen(float oreQendruarParkim)
	{
		
		if(oreQendruarParkim <=3)
			tarifeParkimi=2*oreQendruarParkim;
		else 
			tarifeParkimi= (float) (2*3+ 0.5*(oreQendruarParkim-3));
		
		if(tarifeParkimi>10)
			tarifeParkimi=10;
		
		return tarifeParkimi;
		
		
	}
	

}
