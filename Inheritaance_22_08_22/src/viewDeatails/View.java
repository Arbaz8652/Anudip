package viewDeatails;
import employeeDeatails.*;
public class View {

	public static void main(String[] args) {
		Employee emp= new Employee(24, 48500, "Jason Wolk", "New York", "+1 6132453490");
//		emp.specialization="arbaz";
//		emp.age=24;
//		emp.address="Beakers street, new york";
//		emp.name="Steav Smith";
//		emp.phoneNo="8987834527";
//		emp.salary=48900;
		System.out.println("Name = "+emp.name+"\nAge = "+emp.age+"\nAddress = "+emp.address+"\nPhone = "+emp.phoneNo);
	}
}
