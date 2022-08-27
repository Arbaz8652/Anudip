package bankFunctionality;

public class Account extends RBI  {
	private double availablebalance;
	private double withdraw;
	private double deposite;
	public Account(double availablebalance, double withdraw, double deposite ){
		this.availablebalance=availablebalance;
		this.withdraw=withdraw;
		this.deposite=deposite;
	}
	double accountbalance() {
		return availablebalance;
	}
	double withdraw(double withdraw) {
		availablebalance=availablebalance-withdraw;
		return availablebalance;
	}
	double deposite(double deposite) {
		availablebalance=availablebalance+deposite;
		return availablebalance;
	}

}
