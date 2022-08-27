package bankFunctionality;

public class Customer extends RBI {
	private String name;
	private long acNumber;
	private int pin;
	
	public Customer(String name, int acNumber, int pin) {
		this.name=name;
		this.acNumber=acNumber;
		this.pin=pin;
	}
	public String getname() {
		return name;
	}
	public long getacNumber() {
		return acNumber;
	}
	
}
