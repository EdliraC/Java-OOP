//Cylinder Class) Create a class Cylinder with attributes radius and height, each of
//which has a default value of 1. Provide a method that calculates the cylinders’ volume, which
//is pi multiplied by the square of the radius multiplied by the height. It has set and get methods
//for both radius and height. The set method should verify that radius and height are positive
//numbers. Write a program to test class Cylinder.

import static java.lang.Math.*;

public class Cylinder{
	
	private int rrezja=1;
	private int lartesia=1;
	
	public Cylinder() {}
	
	public Cylinder(int rreze, int lartesia)
	{
		if((rreze<0)||(lartesia<0))
			throw new IllegalArgumentException(" Rrezja ose Lartesia nuk mund te jene negative!");
		this.rrezja=rreze;
		this.lartesia=lartesia;
	}
	
	public double Vellimi()
	{
		return (PI*pow(rrezja, 2)* lartesia);
	}
	
	
	
	public void vendosRreze(int rrezja)
	{
		if(rrezja<0)
			throw new IllegalArgumentException(" Rrezja  nuk mund te jete negative!");
		
		this.rrezja=rrezja;
		
	}
	
	public int gjejRreze()
	{
		return rrezja;
	}
	
	public void vendosLartesi(int lartesia)
	{
		if(lartesia<0)
			throw new IllegalArgumentException(" Rrezja  nuk mund te jete negative!");
		
		this.lartesia=lartesia;
		
	}
	
	public int gjejLartesi()
	{
		return lartesia;
	}
	//e modifikuar per te lejuar perdoruesin te vendose se me sa shifra pas presjes dhjetore duhet
	public String afishoCilinder(int precizion)
	{
		String mesazh;
		switch(precizion)
		{
		case 1: 
			mesazh=String.format("Rreze %d Lartesi %d Vellimi %.1f", rrezja, lartesia, Vellimi());
		break;
		
		case 2:
			mesazh=String.format("Rreze %d Lartesi %d Vellimi %.2f", rrezja, lartesia, Vellimi());
			break;
		
		case 3:
			mesazh=String.format("Rreze %d Lartesi %d Vellimi %.3f", rrezja, lartesia, Vellimi());
			break;
		
		case 4:
			mesazh=String.format("Rreze %d Lartesi %d Vellimi %.4f", rrezja, lartesia, Vellimi());
			break;
			
		case 5:
			mesazh=String.format("Rreze %d Lartesi %d Vellimi %.5f", rrezja, lartesia, Vellimi());
			break;
			
		default:
			mesazh=String.format("Rreze %d Lartesi %d Vellimi %f", rrezja, lartesia, Vellimi());
			break;
		}
		
		return mesazh;
		
	}
}