package com.training.program.dto;

import java.util.List;

public class EmployeeDto {
	
	private String empNo;

	private String empName;

	private String position;
	
	
	private List<String>  degree;
	private List<String>  result;
	private List<String>  year;
	
	private List<String>  tname;
	private List<String>  ttype;
	private List<String>  tyear;
	
	

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
	
	
	


	public List<String> getDegree() {
		return degree;
	}

	public void setDegree(List<String> degree) {
		this.degree = degree;
	}

	public List<String> getResult() {
		return result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}

	public List<String> getYear() {
		return year;
	}

	public void setYear(List<String> year) {
		this.year = year;
	}

	public List<String> getTname() {
		return tname;
	}

	public void setTname(List<String> tname) {
		this.tname = tname;
	}

	public List<String> getTtype() {
		return ttype;
	}

	public void setTtype(List<String> ttype) {
		this.ttype = ttype;
	}

	public List<String> getTyear() {
		return tyear;
	}

	public void setTyear(List<String> tyear) {
		this.tyear = tyear;
	}
	
	
	
	
	

}
