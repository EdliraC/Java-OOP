package ShapeHierarchy;

public class Sphere extends ThreeDimensionalShape {
	
	private final int radius;
	
	
	public Sphere(int radius)
	{
		if(radius<0)
			throw new IllegalArgumentException(" Rrezja duhet e jete pozitive");
		else
			this.radius=radius;
		
		
	}
	
	public int getRadius() { return radius; }
	
	@Override
	public double area()
	{
		return 4*Math.PI*Math.pow(getRadius(), 2);
	}

	@Override
	public double volume()
	{
		return (4/3)*Math.PI * Math.pow(getRadius(), 3);
	}
	
	@Override
	public String toString()
	{
		return String.format("Sfera ka rrezen %d", getRadius());
	}
	
}
