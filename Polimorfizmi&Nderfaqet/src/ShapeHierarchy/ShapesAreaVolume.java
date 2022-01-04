package ShapeHierarchy;
//Create a program that uses
//an array of Shape references to objects of each concrete class in the hierarchy. The program should
//print a text description of the object to which each array element refers. Also, in the loop that processes
//all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
//ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimensionalShape,
//display its area and volume.
public class ShapesAreaVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape formaGjeometrike[]=new Shape[] {
				new Circle(3),
				new Square(4),
				new Triangle(4, 5),
				new Sphere(3),
				new Cube(4),
				new Tetrahedron(4)
		};
		
		
		for(Shape forma: formaGjeometrike)
		{
			System.out.println(forma.getClass().getName());
			
			if(forma instanceof TwoDimensionalShape)
				System.out.printf("Siperfaqja %.2f%n%n", forma.area());
			
			else 
				if(forma instanceof ThreeDimensionalShape)
				{
					ThreeDimensionalShape forme3D= (ThreeDimensionalShape) forma;
					System.out.printf("Siperfaqja %.2f%n", forme3D.area());
					System.out.printf("Vellimi %.2f%n%n", forme3D.volume());
				}
					
			
				
		}

	}

}
