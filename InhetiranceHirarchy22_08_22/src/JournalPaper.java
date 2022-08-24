
public class JournalPaper extends WrittenItem {
	
	private int yearOfpublish;
	
	public JournalPaper(int id, int copy, String name, String author, int yearOfpublish) {
		super(id, copy, name, author);
		this.yearOfpublish=yearOfpublish;
	}
	
	public void getYearOfPublish() {
		System.out.println("Year of Publish : "+yearOfpublish);
	}
}
//	@Override
//	void setBookDeatails(int book_id, String book_name, int book_copy) {
//		id=book_id;
//		name=book_name;
//		copy=book_copy;
//		
//	}
//
//	@Override
//	int getId() {
//		return id;
//	}
//
//	@Override
//	String getName() {
//		return name;
//	}
//
//	@Override
//	int getCopy() {
//		return copy;
//	}
//
//	@Override
//	void setauthor(String author) {
//		authorOf=author;
//	}
//
//	@Override
//	public String getAuthor() {
//		return authorOf;
//	}
	


