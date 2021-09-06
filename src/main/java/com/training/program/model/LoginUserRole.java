package com.training.program.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLES")    // must be persistant entity in database
public class LoginUserRole {

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ROLE_ID")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_seq")
	//@SequenceGenerator(name = "role_id_seq", sequenceName = "role_id_seq", allocationSize = 1, initialValue = 1)
	private Integer roleId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="USER_ROLE")
    private String userRole;

	 

	 

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	 
	
	
	
	
	

}
