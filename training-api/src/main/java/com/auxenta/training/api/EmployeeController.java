package com.auxenta.training.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auxenta.training.Responce;
import com.auxenta.training.ResponceBuilder;
import com.auxenta.training.common.dto.EmployeeDto;
import com.auxenta.training.service.EmployeeService;

@RestController
@RequestMapping(value="api/employee")
public class EmployeeController {
	
	
	
		@Autowired
		EmployeeService employeeService;
	
		@Autowired
		ResponceBuilder responceBuilder;
		
		@RequestMapping(method=RequestMethod.POST)
		public Responce save(@RequestBody EmployeeDto employeeDto) {
			
			try {
				return responceBuilder.getResponce(employeeService.save(employeeDto));
			}catch (Exception e) {
				e.printStackTrace();
				return responceBuilder.getResponce(e.getMessage(), false);
			}
		}
		
		@RequestMapping(value="{id}",method=RequestMethod.GET)
		public Responce getByid(@PathVariable Integer id) {

			try {
				return responceBuilder.getResponce(employeeService.getById(id));
			}catch (Exception e) {
				return responceBuilder.getResponce(e.getMessage(), false);
			}

		}

		@RequestMapping(value="getAll",method=RequestMethod.GET)
		public Responce getAll() {

			try {
				return responceBuilder.getResponce(employeeService.getAll());
			}catch (Exception e) {
				return responceBuilder.getResponce(e.getMessage(), false);
			}

		}

}
