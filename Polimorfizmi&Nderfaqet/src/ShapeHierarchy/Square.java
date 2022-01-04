package ShapeHierarchy;

public class Square extends TwoDimensionalShape{
	
	private final int side;
	
	public Square(int side)
	{
		this.side=side;
	}

	
	public int getSide() {return side; }
	
	@Override
	public double area()
	{
		return Math.pow(getSide(), 2);
	}
	
	@Override
	public String toString()
	{
		return String.format("Square of side %d", getSide());
	}

}
