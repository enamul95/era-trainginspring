package com.training.program.service;

import java.util.List;

import com.training.program.dao.CommonDao;
import com.training.program.dto.ParameterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.program.model.EmployeeStaticData;

@Service
@Transactional
public class CommonServiceImpl implements CommonService {

	@Autowired
	private CommonDao commonDao;

	public List<EmployeeStaticData> getAllDept() {
		// TODO Auto-generated method stub
		return commonDao.getAllDept();
	}

	@Override
	public List<EmployeeStaticData> getDesignation(ParameterDto parameterDto) {
		return commonDao.getDesignation(parameterDto);
	}
//
//	public List<EmployeeStaticData> getDesignation(ParameterDto parameterDto) {
//		// TODO Auto-generated method stub return
//		return commonDao.getDesignation(parameterDto);
//	}
//
//	public void saveData(Object object) {
//		// TODO Auto-generated method stub
//		commonDao.saveData(object);
//
//	}

	/*
	 * public List<EmployeeStaticData> getDesignation(ParameterDto parameterDto) {
	 * // TODO Auto-generated method stub return
	 * commonDao.getDesignation(parameterDto) ; }
	 * 
	 * public void saveData(Object object) { // TODO Auto-generated method stub
	 * commonDao.saveData(object);
	 * 
	 * }
	 * 
	 * public LoginUserInfo getUserData(String userName) { // TODO Auto-generated
	 * method stub return commonDao.getUserData(userName); }
	 * 
	 * public List<DivisionTariffWiseUnpaid> getAllData(int pageNo) { // TODO
	 * Auto-generated method stub return commonDao.getAllData(pageNo); }
	 * 
	 * public Integer getTotalPage() { // TODO Auto-generated method stub return
	 * commonDao.getTotalPage(); }
	 * 
	 * public List<DivisionTariffWiseUnpaid> getDistinctDivision() { // TODO
	 * Auto-generated method stub return commonDao.getDistinctDivision(); }
	 * 
	 * public List<DivisionTariffWiseUnpaid> getDistinctTariff() { // TODO
	 * Auto-generated method stub return commonDao.getDistinctTariff(); }
	 * 
	 * public String callFunction(String idPrefix) { // TODO Auto-generated method
	 * stub return commonDao.callFunction(idPrefix); }
	 * 
	 * public void callProcedure(String eid, String ename, String edesig) { // TODO
	 * Auto-generated method stub
	 * 
	 * commonDao.callProcedure(eid, ename, edesig);
	 * 
	 * }
	 */

}
