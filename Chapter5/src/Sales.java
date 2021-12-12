import javax.swing.JOptionPane;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programi duhet te llogarise shumen totale te fatures se shitjes
		
		//perdoruesi duhet te fuse numrin e artikullit  dhe sasine e shitur
		//ne varesi te numrit te artikullit duhet te llogaritet vlera e shitjes per artikull si 
		//sasi dhe cmim artikulli dhe me pas te mblidhet me totalin e fatures
		//ne fund te afishohet totali i fatures se llogaritur
		
		//inicializojme variablat
		double totalSales=0;
		double sasi=0;
		String sasiProduktiString;
		int sasiProdukti;
		
		String nrProduktiString= JOptionPane.showInputDialog("Fut numrin e artikullit 1-5 ose -1 per te dale\n");
		int nrProdukti=Integer.parseInt(nrProduktiString);
		
		while(nrProdukti!=-1)
		{
			switch(nrProdukti)
			{
			case 1:
				sasiProduktiString= JOptionPane.showInputDialog("Fut sasine e artikullit");
				sasiProdukti=Integer.parseInt(sasiProduktiString);
				
				totalSales=totalSales+ sasiProdukti*2.98;
				break;
			
			case 2:
				sasiProduktiString= JOptionPane.showInputDialog("Fut sasine e artikullit");
				sasiProdukti=Integer.parseInt(sasiProduktiString);
				
				totalSales=totalSales+ sasiProdukti*4.50;
				break;
			
			case 3:
				sasiProduktiString= JOptionPane.showInputDialog("Fut sasine e artikullit");
				sasiProdukti=Integer.parseInt(sasiProduktiString);
				
				totalSales=totalSales+ sasiProdukti*9.98;
				break;
				
			case 4:
				sasiProduktiString= JOptionPane.showInputDialog("Fut sasine e artikullit");
				sasiProdukti=Integer.parseInt(sasiProduktiString);
				
				totalSales=totalSales+ sasiProdukti*4.49;
				break;
				
			case 5:
				sasiProduktiString= JOptionPane.showInputDialog("Fut sasine e artikullit");
				sasiProdukti=Integer.parseInt(sasiProduktiString);
				
				totalSales=totalSales+ sasiProdukti*6.87;
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Nuk keni futur nje produkt te vlefshem\n");
				
			}
			
			nrProduktiString= JOptionPane.showInputDialog("Fut numrin e artikullit te shitur nga 1-5 ose -1 per te perfunduar");
			nrProdukti=Integer.parseInt(nrProduktiString);
		}
		
		String mesazh=String.format("Ju keni blere gjithesej %.3f ALL	", totalSales);
		JOptionPane.showMessageDialog(null, mesazh);
		
		
	}

}
