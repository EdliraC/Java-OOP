
public class Cylinder1 {
	
	private  double radius;
	private  double height;
	
	public Cylinder1()
	{
		
		this.height=1;
		this.radius=1;
	}
	
	public Cylinder1(double r, double h)
	{
		if((r<0) ||(h<0))
			
			throw new IllegalArgumentException();
		height=h;
		radius=r;
	}
	
	public void setRadius(double radius)
	
	{ if(radius<0)
		throw new IllegalArgumentException("Vendosni nje rreze pozitive");
		this.radius=radius;
	}

	public double getRadius()
	{
		return radius;
	}
	
	public void setHeight(double height)
	{
		if(height<0)
			throw new IllegalArgumentException("Vendosni nje lartesi pozitive");
		
		this.height=height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double calculateVolume()
	{
		return Math.PI*Math.pow(getRadius(), 2)*getHeight();
	}
	
	@Override
	public String toString()
	{
		return String.format("Cilindir ka rrezen %.2f dhe ka lartesine %.2f dhe vellimin %.2f", getRadius(), getHeight(), calculateVolume() );
	}

	
}
