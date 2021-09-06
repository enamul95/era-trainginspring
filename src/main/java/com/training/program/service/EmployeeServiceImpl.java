package com.training.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.program.dao.EmployeeDao;
import com.training.program.model.Employee;
 


@Service 
@Transactional  // for transaction
public class EmployeeServiceImpl  implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployees();
	}
	
	 
	
	
	
	
	 

}
