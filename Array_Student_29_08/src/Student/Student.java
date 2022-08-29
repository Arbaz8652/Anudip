package Student;

public class Student {
	private String fname;
	private String lname;
	private int rollNo;
	private Department department;
	
	
	Student (String fname, String lname,Department department, int rollNo){
		this.department=department;
		this.fname=fname;
		this.lname=lname;
		this.rollNo=rollNo;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getLastName() {
		return lname;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public Department getDepartment() {
		return department;
	}
	@Override
	public boolean equals(Object obj) {
		return false;
	}

	public static String department(int d) {
		String department;
		switch(d){
			case 1:{
				department="ELECTRICAL";
				break;
			}
			case 2:{
				department="MECHANICAL";
				break;
			}
			case 3:{
				department="COMPUTER";
				break;
			}
			case 4:{
				department="IT";
				break;
			}
			case 5:{
				department="EXTC";
				break;
			}
			case 6:{
				department="CIVIL";
				break;
			}
			default :
				department=null;
		}
		return department;
	}
}
