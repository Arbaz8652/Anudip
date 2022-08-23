

public class Video extends MediaItem {
	private String director;
	private int yearOfRelease;
	private String genre;
	
	public Video(int id, int copy, String name, int runTime, int yearOfRelease, String director,String genre) {
		super(id, copy, name, runTime);
		this.director=director;
		this.genre=genre;
		this.yearOfRelease=yearOfRelease;
	}
	
	public void getDirector() {
		System.out.println("Director : "+director);
	}
	
	public void getYearOfRelease() {
		System.out.println("Year of release : "+yearOfRelease);
	}
	
	public void getGenre() {
		System.out.println("Genre : "+genre);
	}

}
