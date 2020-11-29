package com.common.config;

import javax.servlet.http.HttpServletRequest;

public final class ViewConfig {
	private ViewConfig() {}
	
	public final static String getViewPath(HttpServletRequest request) {
		return request.getServletContext().getRealPath("/") + "WEB-INF\\view\\";
	}
	
	public final static String getErrorPath(HttpServletRequest request) {
		return getViewPath(request) + "Error.html";
	}
	
	public final static String getOkPath(HttpServletRequest request) {
		return getViewPath(request) + "OK.html";
	}
	
}
