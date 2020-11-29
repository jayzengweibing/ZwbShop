package com.hello.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.common.config.ViewConfig;
import com.common.simple_template.ModelAndView;
import com.common.simple_template.impl.SimpleModelAndView;
import com.common.util.StringUtil;
import com.hello.dao.ConstomerDao;
import com.hello.dao.impl.ConstomerDaoImpl;
import com.hello.pojo.Constomer;
import com.hello.service.CostomerService;
import com.hello.service.LoginService;
import com.hello.service.impl.CostomerServiceImpl;
import com.hello.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/hello.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CostomerService costomer_service;

	String err_path;
	String ok_path;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		costomer_service = new CostomerServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processLogin(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processLogin(request, response);

	}

	private void processLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		err_path = ViewConfig.getErrorPath(request);
		ok_path = ViewConfig.getOkPath(request);
		ModelAndView modelAndView;
		String account = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		Constomer costomer = costomer_service.getCostomerByAccount(account);
		if(costomer == null) {
			modelAndView = new SimpleModelAndView(err_path);
		}else if(!StringUtil.meanEquals(costomer.getPasswd(), passwd)) {
			modelAndView = new SimpleModelAndView(err_path);
		}else {
			request.getSession().setAttribute("user_id", costomer.getId());
			modelAndView = new SimpleModelAndView(ok_path);
		}
		modelAndView.show(response);
	}

	

}
