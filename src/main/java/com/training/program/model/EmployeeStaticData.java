package com.training.program.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_STATIC_DATA")
public class EmployeeStaticData {
	
	@Id
	@Column(name = "ID")
	private Integer ID ;
	
	 
	
	@Column(name="DESIGNATION")
	private String empDesignation;
	
	
	@Column(name="DEPARTMENT")
	private String empDepartment;


	public Integer getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public String getEmpDepartment() {
		return empDepartment;
	}


	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}


}
