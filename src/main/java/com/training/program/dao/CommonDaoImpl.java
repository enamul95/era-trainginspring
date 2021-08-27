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




	/*
	 * public LoginUserInfo getUserData(String userName) {
	 * 
	 * 
	 * // TODO Auto-generated method stub Session session =
	 * sessionFactory.getCurrentSession();
	 * 
	 * Query query = null;
	 * 
	 * query = session.
	 * createQuery(" from com.training.program.model.LoginUserInfo where username =:uname"
	 * );
	 * 
	 * 
	 * 
	 * query.setString("uname", userName);
	 * 
	 * LoginUserInfo loginUserInfo =(LoginUserInfo) query.uniqueResult();
	 * 
	 * // System.out.println(employeeList);
	 * 
	 * 
	 * 
	 * // employee=employeeList.get(0);
	 * 
	 * return loginUserInfo; }
	 * 
	 * // for pagination//////////////
	 * 
	 * public List<DivisionTariffWiseUnpaid> getAllData(int pageNo) { // TODO
	 * Auto-generated method stub
	 * 
	 * int pageSize = 10;
	 * 
	 * 
	 * 
	 * /////////////////////////////////////////////////////////////////////////////
	 * ////////////
	 * 
	 * Session session = sessionFactory.getCurrentSession();
	 * 
	 * Query selectQuery = session.
	 * createQuery(" from com.training.program.model.DivisionTariffWiseUnpaid");
	 * 
	 * selectQuery.setFirstResult((pageNo - 1) * pageSize);
	 * selectQuery.setMaxResults(pageSize); List<DivisionTariffWiseUnpaid> dataList
	 * = selectQuery.list();
	 * 
	 * System.out.println(dataList);
	 * 
	 * return dataList; }
	 * 
	 * public Integer getTotalPage() { // TODO Auto-generated method stub
	 * 
	 * Session session = sessionFactory.getCurrentSession();
	 * 
	 * String countQ
	 * ="Select count (f.id) from com.training.program.model.DivisionTariffWiseUnpaid f"
	 * ;
	 * 
	 * 
	 * Query countQuery = session.createQuery(countQ);
	 * 
	 * Long countResults = (Long) countQuery.uniqueResult();
	 * 
	 * System.out.println("countResults " + countResults);
	 * 
	 * Integer lastPageNumber = (int) (Math.ceil(countResults / 10));
	 * 
	 * System.out.println("lastPageNumber " + lastPageNumber);
	 * 
	 * return lastPageNumber;
	 * 
	 * }
	 * 
	 * public List<DivisionTariffWiseUnpaid> getDistinctDivision() { // TODO
	 * Auto-generated method stub Session session =
	 * sessionFactory.getCurrentSession();
	 * 
	 * Query query = null;
	 * 
	 * query = session.createQuery(
	 * "select distinct uSnd from com.training.program.model.DivisionTariffWiseUnpaid order by uSnd"
	 * );
	 * 
	 * return query.list(); }
	 * 
	 * public List<DivisionTariffWiseUnpaid> getDistinctTariff() { // TODO
	 * Auto-generated method stub Session session =
	 * sessionFactory.getCurrentSession();
	 * 
	 * Query query = null;
	 * 
	 * query = session.createQuery(
	 * "select distinct uTariff from com.training.program.model.DivisionTariffWiseUnpaid order by uTariff"
	 * );
	 * 
	 * return query.list(); }
	 * 
	 * public String callFunction(String idPrefix) { // TODO Auto-generated method
	 * stub Session session = sessionFactory.getCurrentSession();
	 * 
	 * Query query=session.
	 * createSQLQuery("select function_employee_id_creation(:param) from dual");
	 * 
	 * query.setParameter("param", idPrefix);
	 * 
	 * String idNew =(String)query.uniqueResult();
	 * 
	 * return idNew; }
	 * 
	 * public void callProcedure(String eid, String ename, String edesig) { // TODO
	 * Auto-generated method stub
	 * 
	 * Session session = sessionFactory.getCurrentSession();
	 * 
	 * Query query=session.
	 * createSQLQuery("call procedure_employee_data_update(:param,:param2,:param3)"
	 * );
	 * 
	 * query.setParameter("param", eid);
	 * 
	 * query.setParameter("param2", ename);
	 * 
	 * query.setParameter("param3", edesig);
	 * 
	 * query.executeUpdate();
	 * 
	 * }
	 */

}
