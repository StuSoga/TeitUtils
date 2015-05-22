package com.tiet.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(long timestamp, String param) {

		SimpleDateFormat sdf = new SimpleDateFormat(param);

		return sdf.format(new Date(timestamp));
	}

	public static Date format(String time, String param) {

		SimpleDateFormat sdf = new SimpleDateFormat(param);
		try {

			return sdf.parse(time);
		} catch (ParseException e) {

			throw new RuntimeException("格式错误");
		}

	}
}
