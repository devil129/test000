package com.gliolio.common.utils;

/**
 * String工具类
 * 
 * @author gaoyu
 *
 */
public class StringUtils {
	/**
	 * Null判断
	 * 
	 * @param target:目标字符串
	 * @return true:是null;false:非null;
	 */
	public static boolean isNull(String target) {
		return target == null;
	}

	/**
	 * 非Null判断
	 * 
	 * @param target:目标字符串
	 * @return true:非null;false:是null;
	 */
	public static boolean isNotNull(String target) {
		return target != null;
	}

	/**
	 * 空判断
	 * 
	 * @param target:目标字符串
	 * @return true:是空;false:非空;
	 */
	public static boolean isEmpty(String target) {
		return target == null || target.equals("");
	}

	/**
	 * 非空判断
	 * 
	 * @param target:目标字符串
	 * @return true:非空;false:是空;
	 */
	public static boolean isNotEmpty(String target) {
		return target != null && !target.equals("");
	}

	/**
	 * 字符串比较
	 * 
	 * @param targetA:目标A
	 * @param targetB:目标B
	 * @param tarAIsNullReturn:目标A是Null时返回值
	 * @param tarBIsNullReturn:目标B是Null时返回值
	 * @return 比较结果
	 */
	public static boolean equals(String targetA, String targetB, boolean tarAIsNullReturn, boolean tarBIsNullReturn) {

		if (isNull(targetA)) {
			return tarAIsNullReturn;
		}
		if (isNull(targetB)) {
			return tarBIsNullReturn;
		}

		return targetA.equals(targetB);
	}

	/**
	 * 字符串比较
	 * 
	 * @param targetA:目标A
	 * @param targetB:目标B
	 * @return 比较结果
	 */
	public static boolean equals(String targetA, String targetB) {
		return equals(targetA, targetB, false, false);
	}

	/**
	 * 字符串比较
	 * 
	 * @param targetA:目标A
	 * @param targetB:目标B
	 * @param isNullReturn:目标存在Null时返回值
	 * @return 比较结果
	 */
	public static boolean equals(String targetA, String targetB, boolean isNullReturn) {
		return equals(targetA, targetB, isNullReturn, isNullReturn);
	}
}