package com.nakul.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nakul.model.EmployeeJKT;



@Repository
public class EmployeeDAO_imp implements EmployeeJKT_DAO {
	
	@Autowired
	private SessionFactory factory;
	
	@Override
	public void addEmployee(EmployeeJKT jkt) {
			
		factory.getCurrentSession().saveOrUpdate(jkt);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<EmployeeJKT> getAllEmployee() {
		// TODO Auto-generated method stub
		return factory.getCurrentSession().createQuery("from EmployeeJKT").list();
	}

	@Override
	@Transactional
	public EmployeeJKT getEmployeeObj(Integer empId) {
		// TODO Auto-generated method stub
		EmployeeJKT emp=factory.getCurrentSession().get(EmployeeJKT.class, empId);
		return emp;
	}

	@Override
	@Transactional
	public void deleteEmployeeObj(EmployeeJKT emp) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().delete(emp);
	}

	
	
}
