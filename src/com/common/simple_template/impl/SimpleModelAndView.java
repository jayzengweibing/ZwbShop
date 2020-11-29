package com.common.simple_template.impl;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.common.simple_template.ModelAndView;
import com.common.simple_template.View;
import com.common.util.FileUtil;

public class SimpleModelAndView implements ModelAndView {
	private View view_;
	private Map<String, String> model_;
	
	public SimpleModelAndView(View view) {
		this(null,view);
	}
	
	public SimpleModelAndView(Map<String,String> model,View view) {
		this.model_ = model;
		this.view_ = view;
	}
	
	public SimpleModelAndView(String file_path) {
		this(null, file_path);
	}

	public SimpleModelAndView(Map<String, String> model, String file_path) {
		this.model_ = model;
		this.view_ = new FileView(file_path);
	}

	@Override
	public void show(HttpServletResponse response) {
		response.setHeader("Content-Type", "text/html;encoding=utf8");
		String content = view_.getContect();
		if (model_ != null) {
			for (String key : model_.keySet()) {
				String value = model_.get(key);
				content.replaceAll("{{" + key + "}}", value);
			}
		}
		try {
			response.getWriter().println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
