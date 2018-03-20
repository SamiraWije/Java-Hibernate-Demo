package com.auxenta.training.service;

import java.util.List;

import com.auxenta.training.common.dto.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto save(EmployeeDto employeeDto);
	
	public EmployeeDto getById(Integer id);
	
	public List<EmployeeDto> getAll();

}
