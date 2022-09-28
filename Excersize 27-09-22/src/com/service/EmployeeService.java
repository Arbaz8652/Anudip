package com.service;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.dao.EmployeeRepository;
import com.model.Department;
import com.model.Employee;

public class EmployeeService {
	
	private static LocalDate today=LocalDate.now();

	
	//id,FirstName,LastName,email,Number,hireDate(YYYY-MM-DD),Designamtion,Salary,ManagerId,Department
	public static void addEmployee() throws Exception {
		RandomAccessFile empreader=new RandomAccessFile("EmployeeDetails.txt", "rw");
		String s=null;
		LocalDate join=null;
		while((s=empreader.readLine())!=null){
			String[] emp=s.split(",");
			Integer id=Integer.parseInt(emp[0]);
			join=LocalDate.parse(emp[5]);
			//Department d= getDeapartment(emp[9]);
			Employee employee=new Employee(id,
					emp[1],
					emp[2],
					emp[3],
					emp[4],
					join ,
					emp[6],
					Double.parseDouble(emp[7]),
					Integer.parseInt(emp[8]),
					getDeapartment(emp[9])
					);	
			EmployeeRepository.addEmployee(employee);
		}
		empreader.close();
	}
	
	
	private static Department getDeapartment(String dname) throws Exception, IOException {
		RandomAccessFile departmentreader=new RandomAccessFile("EmployeeDepartmentDeatails.txt", "rw");
		Integer departmentId=null;
		Integer managerId=null;
		String de=null;
		Department d=null;
		while((de=departmentreader.readLine())!=null) {
			String[] department=de.split(",");
			if(department[1].equals(dname)) {
				departmentId=Integer.parseInt(department[0]);
				managerId=Integer.parseInt(department[2]);
				departmentreader.close();
				d=new Department(departmentId,department[1], managerId);
				break;
			}
		}
//		switch(dname) {
//			case "Electrical":{
//				return DepartmentName.ELectrical ;
//			}
//			case "Mechanical":{
//				return DepartmentName.Mechanical;
//			}
//			case "Chemical":{
//				return DepartmentName.Chemical;
//			}
//			case "NA":{
//				return null;
//			}
//		}
		return d;
	}
	
	
	public static void printEmp() {
		//System.out.println(EmployeeRepository.getEmployee(0).toString());
		EmployeeRepository.emp.forEach(e->System.out.println(e.toString()));
	}
	
	
	
	//Total Cost to Company
	public static void sumOfSalary() {
		List<Double> sum=EmployeeRepository.emp.stream()
				.map(m->m.getSalary()).collect(Collectors.toList());
		System.out.println(sum.stream().reduce((double) 0, (a,b)->(a+b)));
	}
	
	
	
	//Employee and its Working Duration
	public static void empAndDuration() {
		Map<String,String> empNameAndDuration=new HashMap<>();
		List<String> name=EmployeeRepository.emp.stream()
				.map(e->e.getFirstName()).collect(Collectors.toList());
		List<LocalDate> totalWorkTime=EmployeeRepository.emp.stream()
				.map(e->e.getHireDate()).collect(Collectors.toList());
		List<Period> period=timecompleter(totalWorkTime);
		//empNameAndDuration.stream().filter(name::contains)
		//.collect(Collectors.toMap(k -> k, v -> period.get(period.indexOf(v))));
		empNameAndDuration=makeMap(name,period);
		System.out.println(empNameAndDuration.toString());
	}

	private static Map<String, String> makeMap(List<String> name, List<Period> period) {
		Map<String, String> ans=new HashMap<>();
		for(int i=0; i<name.size(); i++) {
			String year=String.valueOf(period.get(i).getYears());
			String month=String.valueOf(period.get(i).getMonths());
			String day=String.valueOf(period.get(i).getDays());
			String durration=year+":Years "+month+":Months "+day+":Days! ";
			ans.put(name.get(i),durration);
		}
		return ans;
	}

	private static List<Period> timecompleter(List<LocalDate> date){
		List<Period> duration=new ArrayList<>();
		for(int i=0;i<date.size(); i++) {
			Period diff = Period.between(date.get(i),today);
			duration.add(diff);
			//Duration.parse(diff.toString());
		}
		return duration;
	}


	
	
	// Employee name Date of joining and total amount of time that the eployee is working
	public static void nameDojDay() {
		List<String> name=EmployeeRepository
				.emp.stream().map(e->e.getFirstName()+" "+e.getLastName())
				.collect(Collectors.toList());
		List<LocalDate> dateofJoin=EmployeeRepository.emp.stream().map(e->e.getHireDate())
				.collect(Collectors.toList());
		List<DayOfWeek> day=EmployeeRepository.emp.stream()
				.map(e->e.getHireDate().getDayOfWeek()).collect(Collectors.toList());
		printnameDojDay(name,dateofJoin,day);
	}
	
	
	
	
	// To print Employee name Date of joining and total amount of time that the eployee is working
	private static void printnameDojDay(List<String> name,List<LocalDate> join, List<DayOfWeek> dow) {
		for(int i=0; i<name.size();i++) {
			System.out.println("Employee Name:"+name.get(i)+"  Employee joining date:"
					+join.get(i)+"  Day of the week:"+dow.get(i));
		}
	}


	
	
	//Salary Deatils and Amount after raise by 15%
	public static void promotion() {
		List<String> fullname=EmployeeRepository
				.emp.stream().map(e->e.getFirstName()+" "+e.getLastName())
				.collect(Collectors.toList());
		List<String> salary=EmployeeRepository.emp.stream()
				.map(e->(String.valueOf(e.getSalary())+"  salary Incremented by 15% :- "
				+String.valueOf(e.getSalary()+e.getSalary()*0.15)))
				.collect(Collectors.toList());
		printPramotional(fullname,salary);	
	}
	
	
	
	//to Print Salary Deatils and Amount after raise by 15%
	private static void printPramotional(List<String> names, List<String> salary){
		for(int i=0; i<names.size();i++) {
			System.out.println("Employee Name:- "+names.get(i)+"  Employee previus Salary:- "+salary.get(i));
		}
	}
	
	
	
	//Employee Without Any Department
	public static void empWithoutDepartment() {
		List<Employee> emp=EmployeeRepository.emp.stream().filter(e->(e.getManagerId()==0)).collect(Collectors.toList());
		emp.forEach(e->System.out.println(e.toString()));
	}

	
	
	//Sorting Employee by there EmailId
	public static void sortEmpByEmail() {
		//List<Employee> sortedByEmail=EmployeeRepository.emp.stream().sorted().collect(Collectors.toList());
		EmployeeRepository.emp.stream().sorted((x,y)->(x.getEmail().compareTo(y.getEmail()))).forEach(e->System.out.println(e));
//		EmployeeRepository.emp.stream()
//			.sorted(Comparator.com(Employee::getEmail))
//			.forEach(e->System.out.println(e));
	}


	
	//Sorting Employee by there Department Id
	public static void sortEmpByDId() {
//		List<Employee> d=
//		.map(e->e.getDepartment())
		EmployeeRepository.emp.stream()
					.sorted((x,y)->(x.getDepartment().getDepartmentId().compareTo(y.getDepartment().getDepartmentId())))
					.forEach(e->System.out.println(e));
//		.sorted(Comparator.comparingInt(Department::getDepartmentId)).forEach(e->System.out.println(e));

	}


	public static void sortEmpByFName() {
		EmployeeRepository.emp.stream().sorted((x,y)->(x.getFirstName().compareTo(y.getFirstName())))
		.forEach(T->System.out.println(T));
	}


	public static void empWithoutManager() {
		EmployeeRepository.emp.stream().filter(e->(e.getManagerId()==(Integer.parseInt("0"))))
		.forEach(T->System.out.println(T));
	}
	
//	public static void printDepartment() {
//		
//		List<String> dId=EmployeeRepository.depart.stream()
//				.map(d->d.getDepartmentName()).collect(Collectors.toList());
//		dId.forEach(System.out::println);
//	}
	
}
