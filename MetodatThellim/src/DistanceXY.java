//(Distance Between Points) Write method distance to calculate the distance between two
//points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
//this method into an application that enables the user to enter the coordinates of the points.
import java.util.Scanner;

public class DistanceXY {
	
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		//te fut perdoruesi koordinatat e pikes 1;
		System.out.println("Fut koordinaten x te pikes se pare");
		double x1=input.nextDouble();
		
		System.out.println("Fut koordinaten y te pikes se pare");
		double y1=input.nextDouble();
		
		System.out.println("Fut koordinaten x te pikes se dyte");
		double x2=input.nextDouble();
		
		System.out.println("Fut koordinaten y te pikes se dyte");
		double y2=input.nextDouble();
		
		System.out.println("Largesia ndermjet dy pikave te futura eshte " + largesiaXY(x1, y1, x2, y2));
	}
	
	
	public static double largesiaXY(double x1, double y1, double x2, double y2)
	{
		
		return Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2) );
	}

}
