package com.hello.service;
import java.util.List;

import com.hello.pojo.ShoppingOrder;
public interface ShoppingOrderService {
	List<ShoppingOrder> listAllShoppingOrder();
	
	boolean createShoppingOrder(ShoppingOrder order);
}
