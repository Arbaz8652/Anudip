package employeeDeatails;

public class Employee extends Member{
	public String specialization;
	public Employee(int age, int salary, String name, String address, String phoneNo){
		this.name=name;
		this.address=address;
		this.age=age;
		this.phoneNo=phoneNo;
		this.salary=salary;
	}
	
	
//	Employee(int age, int salary, String name, String address, String phoneNo) {
//		super(24, 48500, "Jason Wolk", "New York", "+1 6132453490");
//
//	}

	

//	System.out.println(super.name);
//	System.out.println(super.age);
//	System.out.println(super.address);
//	System.out.println(super.phoneNo);
//	System.out.println(super.salary);
//	Member employee=new Member(24, 48500,"Jason Wolk", "New York", "+1 6132453490");
//			
//	Employee(int age, int salary, String name, String address, String phoneNo) {
//		super(age, salary, name, address, phoneNo);
//		this.age=24;
//		this.address="Beakers street, new york";
//		this.name="Steav Smith";
//		this.phoneNo="8987834527";
//	}
//	public static void main(String[] args) {
//		
//	}
	
}
