package question1.services;
import question1.model.*;
public class CustomerService {
	public boolean checkEligibility(Customer cs){
		System.out.println(cs.getAge());
		if(cs.getAge()>=18) {
			return true;
		}
		else {
			return false;
		}
	}
}
