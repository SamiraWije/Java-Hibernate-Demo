package com.auxenta.training.common.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable{

	private static final long serialVersionUID = 1116161948041291311L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
}
