
public class InteresPerbere {
//a=p(1+r)n
public static void main(String [] args)
{
double vleraAktuale;
double principali=1000.0;

int vite;

//Afishimi i kokes
System.out.printf("%8s %4s %13s\n","Interesi", "Vite", "Vlere Aktuale" );

//llogaritje e vleres aktuale
for(double interes=0.05; interes<=0.1; interes=interes+0.01)
{
		for(vite=1; vite <=10; vite ++)
		{
		vleraAktuale= principali * Math.pow(1+interes, vite);
		System.out.printf("%8.2f %4d %,13.2f\n", interes, vite, vleraAktuale);
		}
		System.out.println("---------------------------");
}		


}
}
