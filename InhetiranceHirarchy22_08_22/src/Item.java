

public abstract class Item {
	private String name;
	private int id;
	private int copy;
	
	public Item(int id, int copy, String name){
		this.id=id;
		this.copy=copy;
		this.name=name;
	}
	
	public void getId() {
		System.out.println("Id of Material : "+id);
	}
	
	public void getCopy() {
		 System.out.println("Available copys Of the Material : "+copy);
	}
	
	public void getName() {
		System.out.println("Name Of The Material : "+name);
	}
	
//	abstract void setBookId(int id);
//	abstract void setBookName(String name);
//	abstract void setBookCopy(int copy);
//	
//	abstract int getBookId(int id);
//	abstract String getBookName(String name);
//	abstract int getBookCopy(int copy);
}
