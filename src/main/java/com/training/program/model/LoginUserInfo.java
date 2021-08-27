package com.training.program.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="USER_INFO")    // must be persistant entity in database
public class LoginUserInfo {
	
	
	@Id
	@Column(name="INFO_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "info_id_seq")
	@SequenceGenerator(name = "info_id_seq", sequenceName = "info_id_seq", allocationSize = 1, initialValue = 1)
	private Integer infoId;
	
	@Column(name="USERNAME")
	private String username;
	
	 
	@Column(name="FIRST_NAME")
	private String firstName;
	
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name = "DEPARTMENT")
	private String employeeDept;

	@Column(name = "DESIGNATION")
	private String employeeDesig;

	@Column(name = "JOINING_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date joiningDate;
	
	
	@Column(name = "BIRTH_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthDate;


	 

	public Integer getInfoId() {
		return infoId;
	}


	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	 
	
	
	
	
	
	

}
