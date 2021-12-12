//A small airline has just purchased a computer for its new automated
//reservations system. You’ve been asked to develop the new system. You’re to write an application
//to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
//Your application should display the following alternatives: Please type 1 for First Class and
//Please type 2 for Economy. If the user types 1, your application should assign a seat in the firstclass
//section (seats 1–5). If the user types 2, your application should assign a seat in the economy
//section (seats 6–10). Your application should then display a boarding pass indicating the person’s
//seat number and whether it’s in the first-class or economy section of the plane.
//Use a one-dimensional boolean array to represent the seating chart of the plane. Initialize all
//the elements of the array to false to indicate that all the seats are empty. As each seat is assigned,
//set the corresponding element of the array to true to indicate that the seat is no longer available.
//Your application should never assign a seat that has already been assigned. When the economy
//section is full, your application should ask the person if it’s acceptable to be placed in the first-class
//section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
//"Next flight leaves in 3 hours."
import javax.swing.JOptionPane;
public class AirlineReservation {
	
//	hap1.Inicializojme vendet e aeroplanit me nje vektor boolean permase 11 me vlere fillestare false
//	hap2. perdoruesi do te rezervoje nje vend ne aeroplan.
//	hapi3. programi te pyese se cfare klase do te beje rezervimin Klasi i Pare apo Ekonomik
//	hapi4. programi te kontrolloje nese ka vende bosh ne klasin e perzgjedhur
//	hapi5. nese ka vende bosh ne klasin e perzgjedhur, te rezervohet nje vend duke vendosur elementin e vektorit nga false ne true.
//	hapi6. nese rezervimi eshte kryer me sukses te printohet boarding pass te klientit me Klasin dhe nr e  vendit
//	hapi7. nese nuk ka vende bosh ne klasin e perzgjedhur, te afishohet qe klasi eshte plot dhe te pyetet klienti nese do te ndryshoje klasin.
//	hapi8. nese klienti ndryshon klasin, shko tek hapi 4
//	hapi9.Nese te dyja klaset jane te rezervuara, atehere te afishohet mesazhi qe te rezervohet ne fluturimin tjeter
//	
//	hap1.Inicializojme vendet e aeroplanit me nje vektor boolean permase 11 me vlere fillestare false
private static boolean[] vende=new boolean[11];


	
public static void main(String [] args)
{
	for(int i=0; i<vende.length; i++)
		vende[i]=false;
	
	//te pyetet perdoruesi per vendin qe do te rezervoje
	String input=JOptionPane.showInputDialog("Mireserdhet ne Linjen tone! Zgjidhni E per klasin Ekonomik ose P per Klasin e pare ose -1 per te dale");
	
	
	while(input!="-1")
	{

			//	hapi4. programi te kontrolloje nese ka vende bosh ne klasin e perzgjedhur
				int pozicioni;
				if(input=="E")
				{
					//kontrollo nese ka vende bosh ne kete klase
					if(vendeBoshKlasiEkonomik())
					{
						//bej rezervimin ne kete klas
						pozicioni=bejRezervim(6,11);//te jape indeksin nga duhet te filloje kerkimin e vendeve bosh
						printoBoardingPass(pozicioni, "E");
					}
			//hapi7. nese nuk ka vende bosh ne klasin e perzgjedhur, te afishohet qe klasi eshte plot 
					//dhe te pyetet klienti nese do te ndryshoje klasin.
					else
						input= JOptionPane.showInputDialog("Nuk ka vende bosh ne klasin e perzgjedhur. A doni te ndryshoni Klasin E ose P ose -1?");
			
					
				}
				else
					
				if(input=="P")
				{
					//kontrollo nese ka vende bosh ne kete klase
					if(vendeBoshKlasiPare())
					{
						//bej rezervimin ne kete klas
						pozicioni=bejRezervim(1,5);//te jape indeksin nga duhet te filloje kerkimin e vendeve bosh
						printoBoardingPass(pozicioni, "P");
					}
			//hapi7. nese nuk ka vende bosh ne klasin e perzgjedhur, te afishohet qe klasi eshte plot 
					//dhe te pyetet klienti nese do te ndryshoje klasin.
					else
						input= JOptionPane.showInputDialog("Nuk ka vende bosh ne klasin e perzgjedhur. A doni te ndryshoni Klasin E ose P ose -1?");
			
					
					
				}
				
					System.out.println("Fluturimi tjeter eshte pas 3 oresh");
	
	

}

public static boolean vendeBoshKlasiEkonomik()
{
	for(int i=6; i<vende.length; i++)
	{
		if(vende[i]==false)
			//vendi eshte bosh
			//ka vende
			return true;
					
	}
	 return false;
	
			
	}


public static boolean vendeBoshKlasiPare()
{
	//a ka vende bosh ne klasin e pare
	for(int i=1; i<6; i++)
	{
		if(vende[i]==false)
			//vendi eshte bosh
			//ka vende
			return true;
					
	}
	 return false;
	}


public static int bejRezervim(int i, int j)
{
	for(int n=i; n<j; n++)
	{
		if(vende[n]==false)
			//rezervo vendin
			vende[n]=true;
			return n;
			
	}
	return -1;
	
	}

public static void printoBoardingPass(int vendi, String klasi)
{
	if(klasi=="E")
		
	System.out.println("Boarding pass i juaj eshte " + vendi+ " klasi Ekonomik");
	
	else 
		System.out.println("Boarding pass i juaj eshte " + vendi+ " klasi i Pare");
	
	}

}
