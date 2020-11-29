package com.common.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtil {
	private FileUtil() {
	}
	
	public static String read_file_all(String file_path) {
		StringBuffer sbuff = new StringBuffer();
		File file = new File(file_path);
		try {
			FileInputStream fis = new FileInputStream(file);
			final int len = 1024;
			byte[] buff = new byte[len];
			int read_len = -1;
			while((read_len = fis.read(buff)) > 0) {
				sbuff.append(new String(buff,0,read_len));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sbuff.toString();
	}
}
