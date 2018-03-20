package com.auxenta.training.repository.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.auxenta.training.common.dto.EmployeeDto;

@Entity
@Table(name="employee")
public class Employee implements BaseDomain{
	
	private static final long serialVersionUID = 3263042500083059434L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")	
private Integer id;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
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

public EmployeeDto buildDto() {
	EmployeeDto dto =new EmployeeDto();
	dto.setId(id);
	dto.setFirstName(firstName);
	dto.setLastName(lastName);
	return dto;
}


public void buildDomain(Serializable dto) {
	EmployeeDto employeeDto=(EmployeeDto) dto;
	this.id=employeeDto.getId();
	this.firstName=employeeDto.getFirstName();
	this.lastName=employeeDto.getLastName();

}



}
