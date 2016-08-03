package com.gliolio.common.utils;


import com.gliolio.common.constant.RegExpStr;

public class StringUtilsEx extends StringUtils {

	public static boolean isMail(String target) {
		return target.matches(RegExpStr.STR_EMAIL);
	}

	public static boolean isTelNumber(String target) {
		return target.matches(RegExpStr.STR_TEL_NUMBER);
	}
}
