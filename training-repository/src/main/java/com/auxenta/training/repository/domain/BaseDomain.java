package com.auxenta.training.repository.domain;

import java.io.Serializable;

public interface BaseDomain  extends Serializable{

	public Object buildDto();

	public void buildDomain(Serializable dto);

}
