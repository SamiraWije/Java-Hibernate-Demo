package com.auxenta.training.repository.dao;

import java.util.List;

import com.auxenta.training.repository.domain.Company;

public interface CompanyDao {


	public void save(Company company);

	public Company getById(Integer id);

	public List<Company> getAll();





}
