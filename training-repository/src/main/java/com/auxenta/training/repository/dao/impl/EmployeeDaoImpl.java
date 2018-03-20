package com.auxenta.training.repository.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.auxenta.training.repository.dao.EmployeeDao;
import com.auxenta.training.repository.domain.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}
	
	public Employee getById(Integer id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAll() {
		return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

}
