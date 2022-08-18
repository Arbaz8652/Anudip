package question1.View;
import question1.model.*;
import question1.services.*;

public class CustomerView {
	public static void main(String args[]) {
	
		Customer customer= new Customer();
		CustomerService CS=new CustomerService();
		boolean eligible;
		System.out.println(customer.getAge());
		eligible=CS.checkEligibility(customer);
		System.out.println("Answer for question 1");
		if(eligible) {
			System.out.println("You are eligible for voting");
		}else{
			System.out.println("You are not eligible for voting");
		}
		
	}
}
