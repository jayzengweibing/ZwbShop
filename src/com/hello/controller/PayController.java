package com.hello.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.simple_template.ModelAndView;
import com.common.simple_template.View;
import com.common.simple_template.impl.SimpleModelAndView;
import com.common.simple_template.impl.StringView;
import com.hello.pojo.ShoppingOrder;
import com.hello.service.ShoppingOrderService;
import com.hello.service.impl.ShoppingOrderServiceImpl;

/**
 * Servlet implementation class PayController
 */
@WebServlet("/pay.do")
public class PayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ShoppingOrderService shopping_order_service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PayController() {
		super();
		shopping_order_service = new ShoppingOrderServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//产生一个订单 订单 待支付
		ShoppingOrder order = new ShoppingOrder();
		order.setAddress(request.getParameter("address"));
		order.setTelephone(request.getParameter("telephone"));
		order.setCustomer_id((Integer) request.getAttribute("user_id"));
		order.setProduct_id((Integer.valueOf( request.getParameter("product_id"))));
		order.setStatus(0);
		shopping_order_service.createShoppingOrder(order);
		//如果顶但的状态是待支付，就跳到支付页面
		//
		
		
	}
}
