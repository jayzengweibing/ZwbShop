package com.common.util;

public final class StringUtil {
	private StringUtil() {
	}

	public static boolean meanEquals(String s1, String s2) {
		s1 = s1 == null ? "" : s1;
		s2 = s2 == null ? "" : s2;
		return s1.trim().equals(s2.trim());
	}
}
