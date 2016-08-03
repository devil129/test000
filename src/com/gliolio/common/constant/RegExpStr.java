package com.gliolio.common.constant;

/**
 * 正则表达式字符串
 * 
 * @author gaoyu
 *
 */
public final class RegExpStr {
	public static final String STR_TEL_NUMBER = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	public static final String STR_EMAIL = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";
}
