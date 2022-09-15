package threads;

import java.util.Currency;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
//		StringBuffer sf=new StringBuffer("Arbaz");
//		StringBuilder sb=new StringBuilder("Arbaaaaz");
//		
//		threadstwo t2=new threadstwo(sb,sf);
//		
//		threadone t1=new threadone(sb,sf);
//		
//		Thread th=new Thread(t1);
//		Thread thh=new Thread(t2);
//		th.start();
//		thh.start();
		
		Locale lc= new Locale("fr", "AF");
		long amount=2500000;
		Currency cr=Currency.getInstance(lc);
		
		System.out.println(amount+cr.getCurrencyCode());
		
		int n1=300;
		int n2=200;
		
		String ans=(n1>n2)?"n1 is greater":(n1==n2)?"Both are same":"n2 is greater";
		System.out.println(ans);
		
	}
}
