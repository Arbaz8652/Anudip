package bankFunctionality;

public class Main {
	public static void main(String[] args) {
		Account ac=new Account(200000, 10000, 10000);
		System.out.println(ac.accountbalance());
		System.out.println(ac.deposite(100000));
		System.out.println(ac.withdraw(300000));
	}
}
