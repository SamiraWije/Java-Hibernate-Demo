package com.auxenta.training.repository.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.auxenta.training.common.dto.CompanyDto;

@Entity
@Table(name="company")
public class Company implements BaseDomain{

	/**
	 *
	 */
	private static final long serialVersionUID = 3263042500083059434L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name="name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyDto buildDto() {
		CompanyDto dto =new CompanyDto();
		dto.setId(id);
		dto.setName(name);
		return dto;
	}


	public void buildDomain(Serializable dto) {
		CompanyDto companyDto=(CompanyDto) dto;
		this.id=companyDto.getId();
		this.name=companyDto.getName();

	}




}
