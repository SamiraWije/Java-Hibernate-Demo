package com.auxenta.training.repository.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.auxenta.training.repository.dao.CompanyDao;
import com.auxenta.training.repository.domain.Company;


@Repository
public class CompanyDaoImpl implements CompanyDao{

	@Autowired
	SessionFactory sessionFactory;

	public void save(Company company) {
		sessionFactory.getCurrentSession().save(company);

	}

	public Company getById(Integer id) {
		return (Company) sessionFactory.getCurrentSession().get(Company.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Company> getAll() {
		return sessionFactory.getCurrentSession().createCriteria(Company.class).list();
	}

}
