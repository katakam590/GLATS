package com.glats.request.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.glats.request.dao.IRequestForDemoDao;
import com.glats.request.model.RequestForDemo;


@Repository
public class RequestForDemoDaoImpl implements IRequestForDemoDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveRequest(RequestForDemo request) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(request);
	}

}
