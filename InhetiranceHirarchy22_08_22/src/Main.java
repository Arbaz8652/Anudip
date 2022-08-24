

public class Main {
	public static void main(String[] args) {
		//Video(int id, int copy, String name, int runTime, int yearOfRelease, String director,String genre) {
		Video vdo=new Video(1234, 2, "Man Vs Wild",34, 2013, "Bear Grills", "Adventure");
		vdo.getName();
		vdo.getGenre();
		vdo.getDirector();
		vdo.getYearOfRelease();
		vdo.getId();
		vdo.getCopy();
		vdo.getRunTime();
//		System.out.println(vdo.getId());
//		System.out.println(vdo.getCopy());
//		System.out.println(vdo.getName());
//		System.out.println(vdo.getRunTime());
//		System.out.println(vdo.getyearOfRelease());
//		System.out.println(vdo.getdirector());
//		System.out.println(vdo.getGenre());
		
		System.out.println("============================================");
		
		//int id, int copy, String name, int runTime, String artist, String genre
		Cd cd = new Cd(2365, 3, "Caravan", 54, "Arijit Singh", "Sufi");
		cd.getName();
		cd.getArtist();
		cd.getGenre();
		cd.getRunTime();
		cd.getId();
		cd.getCopy();
//		System.out.println(cd.getId());
//		System.out.println(cd.getartist());
//		System.out.println(cd.getCopy());
//		System.out.println(cd.getRunTime());
//		System.out.println(cd.getName());
//		System.out.println(cd.getgenre());
//		System.out.println(cd.getyearOfRelease());
		
		System.out.println("============================================");
		
//		int id, int copy, String name, String author
		Book bk=new Book(3490, 4,"Pale Blue Dote ","Carl Segan");
		bk.getName();
		bk.getAuthor();
		bk.getId();
		bk.getCopy();
//		System.out.println(bk.getId());
//		System.out.println(bk.getCopy());
//		System.out.println(bk.getName());
//		System.out.println(bk.getauthor());
		
		
		System.out.println("============================================");
		
		//int id, int copy, String name, String author, int yearOfpublish
		JournalPaper jp=new JournalPaper(6476, 7,"Mathematica Principia","Sir Issac Newton", 1687);
		jp.getName();
		jp.getAuthor();
		jp.getYearOfPublish();
		jp.getId();
		jp.getCopy();
//		System.out.println(jp.getId());
//		System.out.println(jp.getCopy());
//		System.out.println(jp.getName());
//		System.out.println(jp.getauthor());
//		System.out.println(jp.getyearOfPublish());
	}
}


/*
						Itel
			
		WrittenItem					MediaItem
    
     Book  		 Journal		Video          CD

*/