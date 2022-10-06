package org.practicaltest.model;

import java.util.Objects;

public class Department {

	String departmentName;
	int departmentId;
	public Department(String departmentName, int departmentId2) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId2;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentId, departmentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departmentId, other.departmentId) && Objects.equals(departmentName, other.departmentName);
	}
	
	
	
	
}
