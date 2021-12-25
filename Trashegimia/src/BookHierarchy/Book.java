package BookHierarchy;
//(Book Hierarchy) Books can come in various formats, like paper books, audio books, ebooks,
//etc. Create a generic class Book that has as common attributes the title, the year of publication, and the author.
//The constructor of this class should instantiate all three attributes. Override the
//toString method of class Book that returns a string that contains the values of its attributes. Create
//a subclass PrintBook that extends Book with attributes Publisher and ISBN. Create another subclass
//AudioBook which has the book’s size (in MB), its play length and the playback artist’s name as attributes. 
//Both PrintBook and AudioBook classes override the toString method inherited from
//Book. Write a Java application to demonstrate the usage of this hierarchy



public class Book {
	//Book that has as common attributes the title, the year of publication, and the author.
	private final String title;
	private final int yearPublication;
	private final String author;
	
	//The constructor of this class should instantiate all three attributes.
	public Book(String title, int yearPublication, String author)
	{
		this.title=title;
		this.yearPublication=yearPublication;
		this.author=author;
	}
	
	
	//Override the
	//toString method of class Book that returns a string that contains the values of its attributes.
	
	public String gjejTitull()
	{
		return title;
		
	}
	
	public String gjejAutor()
	{
		return author;
		
	}
	
	public int gjejVitPublikimi()
	{
		return yearPublication;
		
	}
	
	
	@Override
	public String toString()
	{
		return String.format("Libri eshte %n %s%nAutor:%s%nVitPublikimi: %d", gjejTitull(),gjejAutor(),gjejVitPublikimi());
		
	}
	
	
	
}

