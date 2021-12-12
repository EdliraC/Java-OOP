//(Total Sales) Use a two-dimensional array to solve the following problem: A company has
//four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
//in a slip for each type of product sold. Each slip contains the following:
//a) The salesperson number
//b) The product number
//c) The total dollar value of that product sold that day
//Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
//from all the slips for last month is available.Write an application that will read all this information for
//last month’s sales and summarize the total sales by salesperson and by product. All totals should be
//stored in the two-dimensional array sales. After processing all the information for last month, display
//the results in tabular format, with each column representing a salesperson and each row representing a 
//particular product. Cross-total each row to get the total sales of each product for last month.
//Cross-total each column to get the total sales by salesperson for last month. Your output should
//include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns.
import java.util.Scanner;
public class TotalSales {
	
	private static int [][] sales=new int[6][5];//rreshit 0 dhe kolona 0 nuk ruajne ndonje vlere
	
	public static void main(String [] args)
	
	{
		//te krijohet objekti scanner
		Scanner input=new Scanner(System.in);
		//te futen shitjet per cdo shites
		//shitesi ruhet ne shtylle
		//produkti ruhet ne rresht
		for(int salesperson=1; salesperson<5; salesperson++)
		{
			System.out.println("Fut shitjet per agjentin me numer " +salesperson );
			
			for(int product=1; product<6; product++)
			{
				System.out.println("Fut shitjet ketij agjenit per produktin " + product);
				sales[product][salesperson]=input.nextInt();
				
			}
		}//u futen shitjet
		//te printohet shitjet per shites dhe per produkt dhe totali per shites dhe totali per produkt
		
		printoShitjetDheTotalet();
		
	}
	
	public static int shitjePerProdukt(int nrProdukti)
	{//produkti ruhet ne rresht
		//metoda te llogarise totalin e shitjeve per produkt
		//inicializojme variablin e shumes
		int totalShitjeProdukt=0;
		
		for(int j=1; j<sales[nrProdukti].length; j++)
		{
			totalShitjeProdukt+=sales[nrProdukti][j];
		}
		
		return totalShitjeProdukt;
	}
	
	//te llogarisim shitjet per agjent shites
	public static int shitjePerAgjent(int nrShites)
	//shitesi ruhet ne shtylle
	{
		int totalShitjeShites=0;
		for(int i=0; i<sales.length; i++)
		{
			totalShitjeShites+=sales[i][nrShites];
		}
		
		return totalShitjeShites;
	}

	
	public static void printoShitjetDheTotalet()
	{
		System.out.println("         Shites 1\tShites 2\tShites 3\tShites 4\tTotal Produkti");
		for(int i=1; i<sales.length; i++)
		{
			System.out.print("Produkt "+i);
			//printo shitjet per produktin i
			for(int j=1; j<sales[i].length; j++)
				System.out.printf("%9d\t",sales[i][j]);
			//totalin e rreshtit te produktit
			System.out.printf("%14d%n", shitjePerProdukt(i));
			
		}
		//te printohen shitjet per shites
		System.out.print("Tot Shites");
		for(int j=1; j<sales[1].length; j++)
			System.out.printf("%9d\t", shitjePerAgjent(j));
	}
}
