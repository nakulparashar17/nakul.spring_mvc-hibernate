package com.nakul.service;

import java.util.List;

import com.nakul.model.EmployeeJKT;


public interface EmployeeJKT_service {
	
	public void addEmployee(EmployeeJKT jkt);

	public List<EmployeeJKT> getAllEmployee();

	public EmployeeJKT getEmployeeObj(Integer empId);

	public void deleteEmployeeObj(EmployeeJKT emp);
	
}
