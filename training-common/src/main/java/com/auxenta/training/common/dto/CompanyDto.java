package com.auxenta.training.common.dto;

import java.io.Serializable;

public class CompanyDto implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 1116161948041291311L;

	private Integer id;

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

}
