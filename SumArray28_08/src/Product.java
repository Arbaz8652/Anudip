
public class Product {
	private String name;
	private int i;
	private double price;
	
	Product(String name,double price,int i){
		this.name=name;
		this.price=price;
		this.i=i;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getId() {
		return i;
	}
	
	public  int[] increamentArray(int[] arr) {
		int[] newarr=new int[arr.length];
		int i=0;
		for (int a:arr) {
			newarr[i]=arr[i]*2;
			i++;
		}
		return newarr;
	}
}
