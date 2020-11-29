package com.hello.service.impl;

import java.util.List;

import com.hello.dao.ShoppingOrderDao;
import com.hello.dao.impl.ShoppingOrderDaoImpl;
import com.hello.pojo.ShoppingOrder;
import com.hello.service.ShoppingOrderService;

public class ShoppingOrderServiceImpl implements ShoppingOrderService {
	
	ShoppingOrderDao dao;
	public ShoppingOrderServiceImpl() {
		dao = new ShoppingOrderDaoImpl();
	}

	@Override
	public List<ShoppingOrder> listAllShoppingOrder() {
		// TODO Auto-generated method stub
		return  dao.listAllShoppingOrder();
	}

	@Override
	public boolean createShoppingOrder(ShoppingOrder order) {
		// TODO Auto-generated method stub
		return false;
	}

}
