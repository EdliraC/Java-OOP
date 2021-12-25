package BookHierarchy;
//Write a Java application to demonstrate the usage of this hierarchy
public class BookHierarchyTest {
	
	public static void main(String [] args)
	{
		//Krijojme nje liber dhe e afishojme ate
		//krijojme nje audio book dhe e afishojme ate
		//krijojme nje print book dhe e afishojme ate
		//String title, int yearPublication, String author, String publisher, String ISBN
		PrintBook liberRi=new PrintBook("Alkemisti", 2003, "Paulo Coelho", "HarperOne", "978-0-06-112241-5");
		System.out.println(liberRi);
		//String title, int yearPublication, String author, int bookSize, int playLengthMin, String artistName
		AudioBook liberRi2=new AudioBook("Alkemisti", 2003, "Paulo Coelho", 121, 125, "John Hopisting" );
		System.out.println(liberRi2);
		
	}

}
