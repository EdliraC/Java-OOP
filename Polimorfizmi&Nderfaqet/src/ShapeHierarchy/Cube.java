package ShapeHierarchy;

public class Cube extends ThreeDimensionalShape{
	
	private final int side;
	
	public Cube(int side)
	{
		if(side <0)
			throw new IllegalArgumentException("Vlera e brinjes duhet te jete pozitive");
		else
			this.side=side;
		
	}
	
	public int getSide() { return side; }

	@Override
	public String toString()
	{
		return String.format("Kubi ka brinjen %d ", getSide());
	}
	
	@Override
	public double area()
	{
		return 6* Math.pow(getSide(), 2);
	}
	
	@Override
	public double volume()
	{
		return Math.pow(getSide(), 3);
	}
}
