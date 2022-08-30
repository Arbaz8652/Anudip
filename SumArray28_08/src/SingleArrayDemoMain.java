
public class SingleArrayDemoMain {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int sum=SingleArrayDemo.sumarray(arr);
		System.out.println(sum);
		
		Product pr=new Product("Lamborghini", 1000000, 1625);

		System.out.println(pr.getId());
		System.out.println(pr.getName());
		System.out.println(pr.getPrice());
	
		int[] newarr=pr.increamentArray(arr);
		
		for(int a:newarr) {
			System.out.println(a);
		}
	}
}
