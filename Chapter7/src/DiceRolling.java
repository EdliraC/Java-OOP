import java.security.SecureRandom;

public class DiceRolling {
	
	public static void main(String [] args)
	{
	
	//1.inicializojme variablat per rezultatet e zarit 1 ,zarit 2 dhe numrave te rastit, frekuenca[] me permase 13
	//2. hidh zar 1 dhe ruaj rezultatin ne rez1
	//3.hidh zar 2 dhe ruaj rezultatin ne rez2
	//4.gjej shumen e rez1+rez2
	//5. rrit me nje frekuence[shuma]
	//perserit nga hapi 2 36_000_000 here
	
	//1.inicializojme variablat per rezultatet e zarit 1 ,zarit 2 dhe numrave te rastit, frekuenca[] me permase 13
	int rezultat1;
	int rezultat2;
	SecureRandom nrRasti=new SecureRandom();
	int [] frekuenca=new int[13];
	
	//2. hidh zar 1 dhe ruaj rezultatin ne rez1
	
	for(int i=1; i<=36_000_000; i++)
	{
		rezultat1= 1+nrRasti.nextInt(6);
		//3.hidh zar 2 dhe ruaj rezultatin ne rez2
		//4.gjej shumen e rez1+rez2
		//5. rrit me nje frekuence[shuma]
		rezultat2=1+nrRasti.nextInt(6);
		
		++frekuenca[rezultat1+rezultat2];
		
	}
	
	//Afisho elementet e vektorit frekuenca
	System.out.println("Shuma\tFrekuenca");
	for(int j=1; j<frekuenca.length; j++)
		System.out.printf("%5d\t%9d%n",j,frekuenca[j]);

	}
	
}
