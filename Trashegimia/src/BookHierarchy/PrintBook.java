package BookHierarchy;

//Create
//a subclass PrintBook that extends Book with attributes Publisher and ISBN.
public class PrintBook extends Book{
	
	private final String publisher;
	private final String ISBN;
	
	public PrintBook(String title, int yearPublication, String author, String publisher, String ISBN)
	{
		super( title, yearPublication, author);
		this.publisher=publisher;
		this.ISBN=ISBN;
		
		
	}
	 public String gjejPublikues() {return publisher;}
	
	 public String gjejISBN() {return ISBN;}
	 
	@Override
	public String toString()
	{
		return String.format("%s%nISBN: %s%nPublikues: %s%n", super.toString(),gjejISBN(), gjejPublikues() );
	}

}
