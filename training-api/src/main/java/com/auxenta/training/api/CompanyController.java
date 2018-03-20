package com.auxenta.training.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auxenta.training.Responce;
import com.auxenta.training.ResponceBuilder;
import com.auxenta.training.common.dto.CompanyDto;
import com.auxenta.training.service.CompanyService;

@RestController
@RequestMapping(value="api/company")
public class CompanyController {


	@Autowired
	CompanyService companyService;

	@Autowired
	ResponceBuilder  responceBuilder;



	@RequestMapping(method=RequestMethod.POST)
	public Responce save(@RequestBody CompanyDto companyDto) {

		try {
			return responceBuilder.getResponce(companyService.save(companyDto));
		}catch (Exception e) {
			return responceBuilder.getResponce(e.getMessage(), false);
		}

	}

	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public Responce getById(@PathVariable Integer id) {

		try {
			return responceBuilder.getResponce(companyService.getById(id));
		}catch (Exception e) {
			return responceBuilder.getResponce(e.getMessage(), false);
		}

	}

	@RequestMapping(value="getAll",method=RequestMethod.GET)
	public Responce getAll() {

		try {
			return responceBuilder.getResponce(companyService.getAll());
		}catch (Exception e) {
			return responceBuilder.getResponce(e.getMessage(), false);
		}

	}



}
