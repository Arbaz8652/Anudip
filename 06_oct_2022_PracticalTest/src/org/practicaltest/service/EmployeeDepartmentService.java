package org.practicaltest.service;

import org.practicaltest.dao.EmployeeDepartmentDAO;
import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentService {

	public static void addEmpAndDepartmentAsHashMap(Employee e, Department d) {
		EmployeeDepartmentDAO.empIdDepartmentId.put(e.getEmpId(), d.getDepartmentId());
		
	}
}
