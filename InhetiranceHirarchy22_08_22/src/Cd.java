
public class Cd extends MediaItem{
	
	private String artist;
	private String genre;
	
	
	public Cd(int id, int copy, String name, int runTime, String artist, String genre) {
		super(id, copy, name, runTime);
		this.artist=artist;
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}
	
	public void getArtist() {
		System.out.println("Artist : "+artist);
	}
	
	public void getGenre() {
		System.out.println("Genre : "+genre);
	}

}
