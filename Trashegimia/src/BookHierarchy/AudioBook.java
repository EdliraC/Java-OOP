package BookHierarchy;
// Create another subclass
//AudioBook which has the book’s size (in MB), 
//its play length and the playback artist’s name as attributes.

public class AudioBook extends Book{
	
	private final int bookSize;
	private final int playLengthMin;
	private final String artistName;
	
	
	public AudioBook(String title, int yearPublication, String author, int bookSize, int playLengthMin, String artistName)
	{
		super(title, yearPublication, author);
		this.bookSize=bookSize;
		this.playLengthMin=playLengthMin;
		this.artistName=artistName;
	}
	
	
	public int gjejGjatesiAudio() {return playLengthMin;}
	public int gjejMadhesiLibri() {return bookSize;}
	public String gjejArtist() {return artistName; }
	
	@Override
	public String toString()
	{
		return String.format("%s%nEmri i Artistit: %s%nMadhesi Libri: %dMB%nGjatesi Audio:%dmin", super.toString(), gjejArtist(), gjejMadhesiLibri(), gjejGjatesiAudio());
	}

}
