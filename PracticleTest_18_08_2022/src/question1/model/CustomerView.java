package question1.model;
import question2.model.*;
import question3.model.*;

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
		System.out.println("Answer for question 2");
		Pattern pttr=new Pattern();
		pttr.pattern();
		
		System.out.println("Answer for question 3");
		Swap swap=new Swap();
		swap.swap(10, 19);
		
	}
}
