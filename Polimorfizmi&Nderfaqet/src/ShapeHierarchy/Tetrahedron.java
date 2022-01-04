package ShapeHierarchy;

public class Tetrahedron extends ThreeDimensionalShape{
	
	private final int base;
	
	public Tetrahedron(int base)
	{
		if(base<0)
			throw new IllegalArgumentException("Baza nuk mund te jete me e vogel se 0");
		
		else
			this.base=base;
		
	}
	
	public int getBase()
	{
		return base;
	}
	
	
	@Override
	public double area()
	{
		return Math.sqrt(3)*Math.pow(getBase(), 2);
	}
	
	@Override
	public double volume()
	{
		return Math.pow(getBase(), 3)/(6*Math.sqrt(2));
	}
	
	@Override
	public String toString()
	{
		return String.format("Pesefaqeshi ka bazen %d", getBase());
	}
	
}
