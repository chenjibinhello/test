package com.example.demo.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Util {

	public static String md5Convert(String data) {
		String s = data == null ? "" : data;
		String ret = "";
		try {
			ret = DigestUtils.md5Hex(s);
		}catch(Exception e) {
			return null;
		}
		return ret;
	}
}
