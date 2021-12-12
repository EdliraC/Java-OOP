
public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// te testojme nese objekti krijohet korrekt
		//testojme nese objekti inicializohet korrekt
		Rational numerThyesor= new Rational();
		
		System.out.println(numerThyesor);
		
		//testojme krijimin e nje numri thyesor qe nuk thjeshtohet
		Rational numerThyesor1=new Rational(4, 5);
		
		System.out.println(numerThyesor1);
		System.out.println(numerThyesor1.toString(3));
		
		//testojme krijimin e nje numri thyesor qe mund te thjeshtohet
		Rational numerThyesor2=new Rational(40, 5);
				
		System.out.println(numerThyesor2);
		System.out.println(numerThyesor2.toString(3));
		
		Rational numerThyesor3=new Rational(8, 6);
		
		System.out.println(numerThyesor3);
		System.out.println(numerThyesor3.toString(3));
				
	}
}
