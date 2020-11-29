package com.hello.dao;

import java.util.List;

import com.hello.pojo.ShoppingOrder;

public interface ShoppingOrderDao {
	List<ShoppingOrder> listAllShoppingOrder();

	boolean insert(ShoppingOrder order);
	
}
