package com.hello.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.config.ViewConfig;
import com.common.simple_template.impl.SimpleModelAndView;

/**
 * Servlet implementation class BuyController
 */
@WebServlet("/buy")
public class BuyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuyController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String viewPath = ViewConfig.getViewPath(request)+ "buy.html";
		Map<String, String> model = new HashMap<String,String>();
		model.put("money_id", request.getParameter("money_id"));
		SimpleModelAndView modelAndView = new SimpleModelAndView(model,viewPath);
		modelAndView.show(response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String address=request.getParameter("address");
		String Telephone=request.getParameter("Telephone");
		String sql="insert into ShoppingOrder(address,telephone) values(address,Telephone)";
		
		
	}

}
