package ShapeHierarchy;

public class Triangle extends TwoDimensionalShape{
	
	private final int base;
	private final int height;
	
	
	public Triangle(int base, int height)
	{
		if(base<0 || height<0)
			throw new IllegalArgumentException("Base of triangle or height of triangle should be more than 0");
		
		this.base=base;
		this.height=height;
		
	}
	
	public int getBase() {return base;}
	
	public int getHeight() {return height;}
	
	@Override 
	public double area()
	{
		return (double)(getHeight()*getBase())/2;
	}

	
	@Override 
	public String toString()
	{
		return String.format("Trekendeshi ka keto permasa Baze: %d Lartesi: %d", getBase(), getHeight());
	}
}
