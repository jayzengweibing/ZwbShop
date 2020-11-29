package com.common.simple_template.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.simple_template.View;

public class StringView implements View {
	private StringBuffer sbuff;
	public StringView(String context){
		sbuff = new StringBuffer(context);
	}
	@Override
	public String getContect() {
		return sbuff.toString();
	}
	@Override
	public void append(String s) {
		sbuff.append(s);
	}

}
