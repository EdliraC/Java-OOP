//(Rational Numbers) Create a class called Rational for performing arithmetic with fractions.
//Write a program to test your class. Use integer variables to represent the private instance variables
//of the class—the numerator and the denominator. Provide a constructor that enables an object of
//this class to be initialized when it’s declared. The constructor should store the fraction in reduced
//form. The fraction 2/4 is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator.
//Provide a no-argument constructor with default values in case no initializers are provided. Provide
//public methods that perform each of the following operations:
//a) Add two Rational numbers: The result of the addition should be stored in reduced
//form. Implement this as a static method.
//b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced
//form. Implement this as a static method.
//c) Multiply two Rational numbers: The result of the multiplication should be stored in
//reduced form. Implement this as a static method.
//d) Divide two Rational numbers: The result of the division should be stored in reduced
//form. Implement this as a static method.
//e) Return a String representation of a Rational number in the form a/b, where a is the
//numerator and b is the denominator.
//f) Return a String representation of a Rational number in floating-point format. (Consider
//providing formatting capabilities that enable the user of the class to specify the
//number of digits of precision to the right of the decimal point.)
import java.lang.Math;
public class Rational {
	
	private int numerator;
	private int denominator;
	
	
	public Rational()
	{
		
	}
	
	public Rational(int n, int d)
	{
		//The constructor should store the fraction in reduced
		//form. The fraction 2/4 is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator.
		//te gjejme plotepjesetuesin me te madh te perbashket ndermjet dy numrave ne menyre qe ta thjeshtojme thyesorin e tyre

		
		this.numerator=n/PlotepjesetuesMaxPerbashket(n, d);
		this.denominator=d/PlotepjesetuesMaxPerbashket(n, d);
		
		
	
	}
	
	private static int PlotepjesetuesMaxPerbashket(int n, int d)
	{
//		Hapi 1. Sheno M dhe N numrin me te madh dhe numrin me te vogel ndermjet dy numrave te plote
//		Hapi 2. Pjeseto M me N dhe sheno R mbetjen nga pjesetimi
//		Hapi 3. Nese R nuk eshte zero, atehere sheno M vleren e N dhe N vleren e R dhe kthehu ne hapin 2, 
		//perndryshe perpjesetuesi me I madhe i perbashket eshte vlera e shenuar ne N
		
 //Zbatojme Algoritimin Euklidean
		int M=Math.max(n, d);
		int N=Math.min(n, d);
		int R=M%N;
		while(R!=0)
		{
			M=N;
			N=R;
			R=M%N;
			
		}
		int PlotepjesetuesMax=N;
		
		return PlotepjesetuesMax;
	}
	
	//a) Add two Rational numbers: The result of the addition should be stored in reduced
	//form. Implement this as a static method.	
	
	public static Rational ShumaThyesore(Rational th1, Rational th2)
	{
				
		int denominatorRi=th1.denominator* th2.denominator;
		int numeratorRi= th1.numerator*th2.denominator+ th2.numerator*th1.denominator;
		
		Rational shuma=new Rational(numeratorRi, denominatorRi);
		
		return shuma;
		
	}
	
	//b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced
	//form. Implement this as a static method.
	public static Rational ZbritjaThyesore(Rational th1, Rational th2)
	{
				
		int denominatorRi=th1.denominator* th2.denominator;
		int numeratorRi= th1.numerator*th2.denominator- th2.numerator*th1.denominator;
		
		Rational zbritje=new Rational(numeratorRi, denominatorRi);
		
		return zbritje;
		
	}
	//c) Multiply two Rational numbers: The result of the multiplication should be stored in
	//reduced form. Implement this as a static method.
	
	public static Rational shumezimThyesash(Rational th1, Rational th2)
	{
		int numeratorRi=th1.numerator* th2.numerator;
		int denominatorRi=th1.denominator* th2.denominator;
		
		return new Rational(numeratorRi, denominatorRi);
				
		
	}
	
	//d) Divide two Rational numbers: The result of the division should be stored in reduced
	//form. Implement this as a static method.
	
	public static Rational pjesetimThyesash(Rational th1, Rational th2)
	{	int temp=th2.numerator;
		th2.numerator=th2.denominator;
		th2.denominator=temp;
		
		return shumezimThyesash(th1, th2);
		
		
	}
	
	//e) Return a String representation of a Rational number in the form a/b, where a is the
	//numerator and b is the denominator.
	public String toString()
	{
		return String.format("%n%d/%d", numerator, denominator);
	}
	
	//f) Return a String representation of a Rational number in floating-point format. (Consider
	//providing formatting capabilities that enable the user of the class to specify the
	//number of digits of precision to the right of the decimal point.)
	public String toString( int precizion)
	{
		float numerMePresje=(float)numerator/denominator;
		String mesazh;
		switch(precizion)
		{
		case 1:
			mesazh= String.format("%.1f", numerMePresje);
			break;
		case 2:
			mesazh= String.format("%.2f", numerMePresje);
			break;
		case 3:
			mesazh= String.format("%.3f", numerMePresje);
			break;
		case 4:
			mesazh= String.format("%.4f", numerMePresje);
			break;
		case 5:
			mesazh= String.format("%.5f", numerMePresje);
			break;
		case 6:
			mesazh= String.format("%.6f", numerMePresje);
			break;	
			
		default:
			mesazh= String.format("%.7f", numerMePresje);
		
		}
		
		return mesazh;
	}

}
