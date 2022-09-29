package org.practicletest.question2;

import java.util.Scanner;

public class LoginVAlidation {

	public static void main(String[] args) throws PassWordFormattException {
		Personn p=new Personn("Arbazz", "yes");
				System.out.println(p.toString());
Scanner sc= new Scanner(System.in);
		String[] loginid=new String[5];
		String[] passWord=new String[5];
		String regex1 = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		String regex2 = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		 
		System.out.print("Enter Login ID : ");
		String loginId=sc.next();
		sc.nextLine();
		System.out.print("Enter PassWord : ");
		String pass=sc.next();
		sc.nextLine();
		sc.close();
		boolean matchemail=loginId.matches(regex1);
		boolean matchpass=pass.matches(regex2);
		
		if(matchemail && matchpass) {
			loginid[0]=loginId;
			passWord[0]=pass;
		}else {
			throw new PassWordFormattException("Invalid EmailId or PassWord!");
		}
		
			
	}
	public record Personn(String name, String contact) {} 

}
