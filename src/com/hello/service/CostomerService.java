package com.hello.service;

import com.hello.pojo.Constomer;

public interface CostomerService {
	
	/***
	 * 
	 * @param account
	 * @return null account not exist;not null account exist;
	 */
	Constomer getCostomerByAccount(String account);
}
