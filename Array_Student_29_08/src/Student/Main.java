package Student;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String sdetail;
		String[] std;
		String fname;
		String lastname;
		int rollNo, d;
		String department;
		Department dment;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Students are there.");
		int n=sc.nextInt();
		System.out.println();
		Student[] students=new Student[n];
		
//		System.out.println("Enter Students details in {rollno Firstname LastName department} form");
		for(int i=0; i<n; i++) {
//			sdetail=sc.nextLine();
//			std[0]=sdetail.split(" ");
//			System.out.println(sdetail);
			
			System.out.println("Enter First Name : ");
			fname=sc.next();
			
			System.out.printf("Enter Last name : ");
			lastname=sc.next();
			
			System.out.printf("Enter Roll Number : ");
			rollNo=sc.nextInt();
	
			
		
			System.out.println("Select Department:\n"
					+"1)Electrical\n"
					+"2)Mechanical\n"
					+"3)Computer\n"
					+"4)IT\n"
					+"5)EXTC\n"
					+"6)Civil");
			d=sc.nextInt();
			dment=Department.valueOf(Student.department(d));
			students[i]=new Student(fname,lastname,dment,rollNo);
		}	
		
		System.out.println("================================================================");
		System.out.println("For Serch Student deatails by roll Number ");
		System.out.println("Enter Roll No");
		int srn=sc.nextInt();
		for(Student s:students) {
			if(s.getRollNo()==srn) {
				System.out.println(s.getFirstName()+" "+s.getLastName()+" "+s.getDepartment());
				break;
			}
		}

	}

}

//do {
//	try {
//	System.out.printf("Enter Departmnet :- ",department=sc.nextLine());
//	d=Department.valueOf(department);
//	b=false;
//	}catch(Exception e) {
//		System.out.println("These are allowed :- ELECTRICAL,MECHANICAL, EXTC, COMPUTER,IT");
//	}
