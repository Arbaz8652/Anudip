
abstract class WrittenItem extends Item {
	
	private String author;
	
	public WrittenItem(int id, int copy, String name, String author) {
		super(id, copy, name);
		this.author=author;
	}
	
	public void getAuthor() {
		System.out.println("Author : "+author);
	}

	
	
	
	
}	
//	String authorOf;
//	abstract void setauthor(String author);
//	abstract void setBookDeatails(int id,String name,int copy);
////	abstract void setBookId(int id);
////	abstract void setBookName(String name);
////	abstract void setBookCopy(int copy);
//	
//	abstract int getId();
//	abstract String getName();
//	abstract int getCopy();
//	abstract String getAuthor();
////	@Override
////	void setBookId(int id) {
////		book_id=id;
////	}
////
////	@Override
////	void setBookName(String name) {
////		book_name=name;
////	}
////
////	@Override
////	void setBookCopy(int copy) {
//		book_copy=copy;
//		
//	}
//
//	@Override
//	int getBookId(int id) {
//		return book_id;
//	}
//
//	@Override
//	String getBookName(String name) {
//		return book_name;
//	}
//
//	@Override
//	int getBookCopy(int copy) {
//		return book_copy;
//	}
	


