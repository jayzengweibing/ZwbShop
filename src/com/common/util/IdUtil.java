package com.common.util;

import java.util.Date;
import java.util.Random;

public final class IdUtil {
	private IdUtil() {
	}

	public static Long generateId() {
		Date date = new Date();
		long date_stamp = date.getTime();
		long master52 = 0xf_ffff_ffff_ffffL;
		date_stamp &= master52;
		date_stamp <<= 11;
		Random random = new Random();
		long rand_stamp = random.nextLong();
		long master11 = 0x7ffL;
		rand_stamp &= master11;
		long result = date_stamp | rand_stamp;
		return result;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			System.out.println(generateId());
	}
}
