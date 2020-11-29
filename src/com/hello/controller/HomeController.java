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
import com.hello.pojo.Product;
import com.hello.service.ProductService;
import com.hello.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductService product_service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		product_service = new ProductServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> products = product_service.listAllProduct();
		View v = new StringView("");
		v.append("<h1>products</h1>");
		v.append("<ul>");
		for (Product p : products) {
			v.append(String.format(
					"<li>%s:%f <span><a href='buy?product_id=%d'>buy</a></span> -- <button>add</button></li>",
					p.getName(), p.getPrice(),p.getId()));
		}
		v.append("</ul>");
		ModelAndView modelAndView = new SimpleModelAndView(v);
		modelAndView.show(response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
