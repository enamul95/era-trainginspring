package com.training.program.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.program.model.Employee;
 

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<Employee> getEmployees() {

		// return employeeDao.getEmployeeList();

		Session session = sessionFactory.getCurrentSession();

		Query query = null;

		query = session.createQuery(" from com.training.program.model.Employee");

		return query.list();

	}
	
	
	 

}
