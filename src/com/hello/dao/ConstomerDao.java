package com.hello.dao;

import java.util.List;

import com.hello.pojo.Constomer;

public interface ConstomerDao {
	Constomer find(Integer id);
	Constomer findByAccount(String account);
	
}
