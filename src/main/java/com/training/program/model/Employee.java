package com.training.program.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_INFO")
public class Employee {
	
	@Id
	@Column(name="EMP_NO")
	private String empNo;

	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="POSTION")
	private String position;
	
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="EMP_NO")
	 * 
	 * @OrderColumn(name="INDEX_NO") private List<EmployeeTraining>
	 * employeeTraining;
	 */

	

	 
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	


	/*
	 * public List<EmployeeTraining> getEmployeeTraining() { return
	 * employeeTraining; }
	 * 
	 * public void setEmployeeTraining(List<EmployeeTraining> employeeTraining) {
	 * this.employeeTraining = employeeTraining; }
	 */

	
	
	
}
