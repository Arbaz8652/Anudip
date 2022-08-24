package employeeDeatails;

public class Member {
	public String name;
	public String address;
	public int age;
	public String phoneNo;
	public int salary;
	Member(){
		
	}
//	public Member(int age, int salary, String name, String address, String phoneNo){
//		this.name=name;
//		this.address=address;
//		this.age=age;
//		this.phoneNo=phoneNo;
//		this.salary=salary;
//	}
	public void printSalary() {
		System.out.println(salary);
	}
}
