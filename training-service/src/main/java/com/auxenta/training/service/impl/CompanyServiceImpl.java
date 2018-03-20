package com.auxenta.training.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auxenta.training.common.dto.CompanyDto;
import com.auxenta.training.repository.dao.CompanyDao;
import com.auxenta.training.repository.domain.Company;
import com.auxenta.training.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDao companyDao;


	@Transactional
	public CompanyDto save(CompanyDto companyDto) {
		Company company=new Company();
		company.buildDomain(companyDto);
		companyDao.save(company);

		return company.buildDto();

	}

	@Transactional
	public CompanyDto getById(Integer id) {
		return companyDao.getById(id).buildDto();
	}

	@Transactional
	public List<CompanyDto> getAll() {
		List<Company> companies=companyDao.getAll();
		List<CompanyDto> companyDtos =new ArrayList<CompanyDto>();
		for(Company company:companies) {
			companyDtos.add(company.buildDto());
		}
		return companyDtos;
	}

}
