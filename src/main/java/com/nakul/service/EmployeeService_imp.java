package com.nakul.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nakul.DAO.EmployeeJKT_DAO;
import com.nakul.model.EmployeeJKT;


@Service
public class EmployeeService_imp implements EmployeeJKT_service
{
	@Autowired
	private EmployeeJKT_DAO emp_dao;
	
	@Override
	@Transactional
	public void addEmployee(EmployeeJKT jkt) {
		emp_dao.addEmployee(jkt);
	}

	@Override
	@Transactional
	public List<EmployeeJKT> getAllEmployee() {
		// TODO Auto-generated method stub
		return emp_dao.getAllEmployee();
	}

	@Override
	@Transactional
	public EmployeeJKT getEmployeeObj(Integer empId) {
		// TODO Auto-generated method stub
		EmployeeJKT emp=emp_dao.getEmployeeObj(empId);
		return emp;
	}

	@Override
	@Transactional
	public void deleteEmployeeObj(EmployeeJKT emp) {
		// TODO Auto-generated method stub
		emp_dao.deleteEmployeeObj(emp);
		
	}

	
	

}
