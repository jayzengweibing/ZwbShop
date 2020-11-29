package com.hello.service.impl;

import java.util.List;

import com.hello.dao.ProductDao;
import com.hello.dao.impl.ProductDaoImpl;
import com.hello.pojo.Product;
import com.hello.service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDao dao;
	public ProductServiceImpl() {
		dao = new ProductDaoImpl();
	}
	@Override
	public List<Product> listAllProduct() {
		return dao.listAll();
	}

}
