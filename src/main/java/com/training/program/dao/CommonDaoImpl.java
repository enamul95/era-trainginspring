package com.training.program.dao;

import java.util.List;

import com.training.program.dto.ParameterDto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.program.model.EmployeeStaticData;

@Repository("commonDao")
public class CommonDaoImpl implements CommonDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<EmployeeStaticData> getAllDept() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();

		Query query = null;

		query = session.createQuery(
				"select distinct empDepartment from com.training.program.model.EmployeeStaticData order by empDepartment");

		return query.list();
	}

	@Override
	public List<EmployeeStaticData> getDesignation(ParameterDto parameterDto) {
		Session session =sessionFactory.getCurrentSession();

		Query query = null;



		query = session.createQuery(
				"select distinct empDesignation from EmployeeStaticData where empDepartment =:deptName  order by empDepartment");

		query.setString("deptName", parameterDto.getDeptName());

		return query.list();
	}

	@Override
	public void saveData(Object object) {
		Session session = this.sessionFactory.getCurrentSession();

		session.save(object);
	}




}
