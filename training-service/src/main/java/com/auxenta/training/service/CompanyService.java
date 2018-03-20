package com.auxenta.training.service;

import java.util.List;

import com.auxenta.training.common.dto.CompanyDto;

public interface CompanyService {


	public CompanyDto save(CompanyDto companyDto);

	public CompanyDto getById(Integer id);

	public List<CompanyDto> getAll();

}
