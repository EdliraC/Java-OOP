package ShapeHierarchy;

public class Circle extends TwoDimensionalShape{
	
	private final int radius;
	
	public Circle(int radius)
	{
		this.radius=radius;
		
	}
	
	public int getRadius() {return radius;}
	
	@Override 
	public double area()
	{ 
		return Math.PI* Math.pow(getRadius(), 2);
	}
	
	@Override
	public String toString()
	{
		return String.format("Circle with radius %d", getRadius());
	}

}
