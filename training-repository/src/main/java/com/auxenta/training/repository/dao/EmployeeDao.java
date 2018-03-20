package com.auxenta.training.repository.dao;

import java.util.List;

import com.auxenta.training.repository.domain.Employee;


public interface EmployeeDao {
	
	public void save(Employee employee);
	
	public Employee getById(Integer id);
	
	public List<Employee> getAll();

}
