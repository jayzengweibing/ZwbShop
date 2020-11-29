package com.common.simple_template.impl;


import com.common.simple_template.View;
import com.common.util.FileUtil;

public class FileView implements View {
	String file_path;
	View view_;
	FileView(String filepath){
		file_path = filepath;
		String content = FileUtil.read_file_all(file_path);
		view_ = new StringView(content);
	}
	
	@Override
	public String getContect() {
		return view_.getContect();
	}

	@Override
	public void append(String s) {
		view_.append(s);
	}



}
