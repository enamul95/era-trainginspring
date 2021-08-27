package com.training.program.dto;

import java.util.Date;

 
import org.springframework.format.annotation.DateTimeFormat;

public class UserDto {
	
    private String empID;
	
	private String empFirstName;
	
	private String empLastName;
	
	
	private String empPassword;	 
	
	private String employeeDept;
	
	private String employeeDesig;
	
	private String role;
	
	//@Temporal(TemporalType.TIMESTAMP)	
	//@DateTimeFormat(pattern = "dd/MM/yyyy")	
	private Date empJoiningDate;
	
	/*
	 * // In model /////////
	 * 
	 * @Column(name = "JOINING_DATE")
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @DateTimeFormat(pattern = "dd/MM/yyyy") private Date joiningDate;
	 */
	
	//@Temporal(TemporalType.TIMESTAMP)	
	//@DateTimeFormat(pattern = "dd/MM/yyyy")	
	private Date empBirthDate;

	 

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	 
	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	 

	public String getEmployeeDesig() {
		return employeeDesig;
	}

	public void setEmployeeDesig(String employeeDesig) {
		this.employeeDesig = employeeDesig;
	}

	public Date getEmpJoiningDate() {
		return empJoiningDate;
	}

	public void setEmpJoiningDate(Date empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}

	public Date getEmpBirthDate() {
		return empBirthDate;
	}

	public void setEmpBirthDate(Date empBirthDate) {
		this.empBirthDate = empBirthDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	
	
	

}
