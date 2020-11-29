package com.hello.service.impl;

import com.hello.dao.ConstomerDao;
import com.hello.dao.impl.ConstomerDaoImpl;
import com.hello.pojo.Constomer;
import com.hello.service.CostomerService;

public class CostomerServiceImpl implements CostomerService {
	ConstomerDao constomer_dao;
	
	public CostomerServiceImpl() {
		constomer_dao = new ConstomerDaoImpl();
	}

	@Override
	public Constomer getCostomerByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}


}
