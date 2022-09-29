package question1.main;

import java.util.Scanner;
import question1.exception.InvalidNameException;

public class Mian {

	public static void main(String[] args) throws InvalidNameException {
		Scanner scanner=new Scanner(System.in);
		String s="";
		
		while(s=="") {
			System.out.println("Enter Your Name.");
			s=scanner.nextLine();
			if(s==""){break;}
			try {
				validateName(s);
			}catch(InvalidNameException e) {
				e.printStackTrace();
			}
			s="";
		}
		System.out.println("sjdshdsdsdj");
		
		
		
		scanner.close();
	}

	private static void validateName(String s) throws InvalidNameException {
		
		String[] name=s.split(" ");
		if(name.length!=2) {
			throw new InvalidNameException("Your Name Is Incorrect. Try Again!");
		}
	}
}
