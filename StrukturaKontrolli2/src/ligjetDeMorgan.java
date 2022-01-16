//(De Morgan’s Laws) In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !.
//De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
//These laws state that the expression !(condition1 && condition2) is logically equivalent to the expression
//(!condition1 || !condition2). Also, the expression !(condition1 || condition2) is logically
//equivalent to the expression (!condition1 && !condition2). Use De Morgan’s laws to write equivalent
//expressions for each of the following, then write an application to show that both the original expression
//and the new expression in each case produce the same value:
//a) !(x < 5) && !(y >= 7)
//b) !(a == b) || !(g != 5)
//c) !((x <= 8) && (y > 4))
//d) !((i > 4) || (j <= 6))


public class ligjetDeMorgan{
	
	public static void main(String [] args)
	{
		//a)te provojme nese shprehjet !(x < 5) && !(y >= 7) dhe !((x < 5) ||(y >= 7)) prodhojne te njejtin rezultat,
		//pra kane te njejten tabele vertetesie
		
		
		System.out.println("Te ndertojme vertetesine e shprehjes !(x < 5) && !(y >= 7)"); 
		System.out.println();
		System.out.println("(x < 5)\t(y >= 7)\t!(x < 5)\t!(y >= 7)\t!(x < 5) && !(y >= 7))");
		//ndryshojme vleren e x dhe y per t'i dhene shprehjeve te thjeshta vlera te ndryshme vertetesie
		int x=4;
		int y=7;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+!(x < 5)+"\t\t"+!(y >= 7)+"\t\t"+(!(x < 5) && !(y >= 7)));
		x=6;
		y=7;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+!(x < 5)+"\t\t"+!(y >= 7)+"\t\t"+(!(x < 5) && !(y >= 7)));
		x=6;
		y=5;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+!(x < 5)+"\t\t"+!(y >= 7)+"\t\t"+(!(x < 5) && !(y >= 7)));
		x=4;
		y=6;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+!(x < 5)+"\t\t"+!(y >= 7)+"\t\t"+(!(x < 5) && !(y >= 7)));
		
		
		//te shikojme vleren e vertetesise te shprehjes !((x < 5) ||(y >= 7))
		System.out.println("Te ndertojme vertetesine e shprehjes !((x < 5) ||(y >= 7))"); 
		System.out.println();
		System.out.println("(x < 5)\t(y >= 7)\t(x < 5) ||(y >= 7)\t!((x < 5) ||(y >= 7))");
		 x=4;
		 y=7;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+((x < 5) ||(y >= 7))+"\t\t\t"+!((x < 5) ||(y >= 7)));
		x=6;
		y=7;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+((x < 5) ||(y >= 7))+"\t\t\t"+!((x < 5) ||(y >= 7)));
		x=6;
		y=5;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+((x < 5) ||(y >= 7))+"\t\t\t"+!((x < 5) ||(y >= 7)));
		x=4;
		y=6;
		System.out.println((x < 5)+"\t"+(y >= 7)+"\t\t"+((x < 5) ||(y >= 7))+"\t\t\t"+!((x < 5) ||(y >= 7)));
	}
}