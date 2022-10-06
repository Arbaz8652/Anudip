package org.practicaltest.service;


import org.practicaltest.dao.DepartmentDAO;
import org.practicaltest.model.Department;


public class DepartmentService {

	//Adding Departmnet in DepartmentDAO   (HashSet)
	public static void addDepartmentToDao(Department d) {
		DepartmentDAO.departments.add(d);	
	}
	
}
