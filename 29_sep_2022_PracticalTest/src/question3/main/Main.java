package question3.main;

public class Main {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			public void run() {
				System.out.println("Welcome to Lamda Expression Thread.");
			}
		});
		t1.start();
	}
}
