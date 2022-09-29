package question2.main;

import question2.thread.ThankYou;
import question2.thread.Welcome;

public class Mian {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Welcome());
		t1.start();
		Thread t2=new Thread(new ThankYou());
		t2.start();
		
	}

}
