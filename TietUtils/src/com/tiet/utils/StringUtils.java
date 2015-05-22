package com.tiet.utils;

public class StringUtils {

	public static String substringAfter(String hql, String separator) {

		if (isEmpty(hql) || isEmpty(separator)) {

			return hql;
		}

		if (hql.indexOf(separator) == -1) {

			return hql;
		}
		hql = hql.substring(hql.indexOf(separator) + separator.length(), hql.length());

		return hql;
	};

	public static String substringBefore(String hql, String separator) {

		if (isEmpty(hql) || isEmpty(separator)) {

			return hql;
		}

		if (hql.indexOf(separator) == -1) {

			return hql;
		}
		hql = hql.substring(0, hql.indexOf(separator));

		return hql;
	};

	private static boolean isEmpty(String arg) {

		if ("".equals(arg) || arg == null) {

			return true;
		}

		return false;
	}
}
