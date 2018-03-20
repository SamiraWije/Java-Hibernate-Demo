package com.auxenta.training.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auxenta.training.common.dto.EmployeeDto;
import com.auxenta.training.repository.dao.EmployeeDao;
import com.auxenta.training.repository.domain.Employee;
import com.auxenta.training.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Transactional
	public EmployeeDto save(EmployeeDto employeeDto) {
		Employee employee=new Employee();
		employee.buildDomain(employeeDto);
		employeeDao.save(employee);

		return employee.buildDto();

	}

	@Transactional
	public EmployeeDto getById(Integer id) {
		return employeeDao.getById(id).buildDto();
	}

	@Transactional
	public List<EmployeeDto> getAll() {
		List<Employee> employies=employeeDao.getAll();
		List<EmployeeDto> employeeDtos =new ArrayList<EmployeeDto>();
		for(Employee employee:employies) {
			employeeDtos.add(employee.buildDto());
		}
		return employeeDtos;
	}

}
