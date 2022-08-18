package question3.model;

public class Swap {
	public void swap(int a , int b) {
//		int a=10;
//		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
}
