package com.training.program.dao;

import java.util.List;

import com.training.program.dto.ParameterDto;
import com.training.program.model.EmployeeStaticData;

public interface CommonDao {
	
	List<EmployeeStaticData> getAllDept();

	List<EmployeeStaticData> getDesignation(ParameterDto parameterDto);
	void saveData(Object object);
//
//	List<EmployeeStaticData> getDesignation(ParameterDto parameterDto);
//
//
//	void saveData(Object object);
	
	
	
	/*
	 * List<EmployeeStaticData> getDesignation(ParameterDto parameterDto);
	 * 
	 * void saveData(Object object);
	 * 
	 * LoginUserInfo getUserData(String userName);
	 * 
	 * 
	 * ////////// for pagination
	 * 
	 * List<DivisionTariffWiseUnpaid> getAllData(int pageNo);
	 * 
	 * Integer getTotalPage();
	 * 
	 * List<DivisionTariffWiseUnpaid> getDistinctDivision();
	 * 
	 * List<DivisionTariffWiseUnpaid> getDistinctTariff();
	 * 
	 * String callFunction(String idPrefix);
	 * 
	 * void callProcedure(String eid, String ename, String edesig);
	 */

	 

}
