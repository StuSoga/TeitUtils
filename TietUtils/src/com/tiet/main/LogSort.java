package com.tiet.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.tiet.entity.CallLog;
import com.tiet.entity.Log;
import com.tiet.entity.MapValueComparator;

/**
 * 
 * @detail 通讯详情排序
 * @author 今朝惜客
 * @date 2015年5月17日下午10:44:35
 *
 */
public class LogSort {

	/**
	 * 通话频率排序：只算来电、去电
	 * 
	 * @param logs
	 * @return
	 */
	public static List<Integer> nativeSort(List<CallLog> logs) {

		Log Log = null;
		Set<String> set = null;

		String key = "";
		Map<String, Log> map = new LinkedHashMap<String, Log>();
		for (CallLog log : logs) {

			key = (log.getLogID() + "").trim();
			if (!"0".equals(key)) {

				if (map.get(key) != null) {

					Log = map.get(key);

				} else {
					Log = new Log();
				}

				if (CallLog.CALL_IN == log.getCallType()
						|| CallLog.CALL_OUT == log.getCallType()) {

					if (Log.getSet() != null) {

						set = Log.getSet();
						set.add(format(log.getDate(), "yyyy-MM-dd"));
					} else {

						set = new HashSet<String>();
					}

					set.add(format(log.getDate(), "yyyy-MM-dd"));
					Log.setID(Integer.parseInt(key));
					Log.setSet(set);
					map.put(key, Log);
				}
			}

		}
		
		Map<String, Integer> intMap = new TreeMap<String, Integer>();
		
		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<?, ?> entity = (Entry<?, ?>) it.next();
			Log log = (Log) entity.getValue();

			intMap.put((String) entity.getKey(), log.getSet().size());

			}

		return sortMapByValue(intMap);
	}

	/**
	 * map对value进行排序:倒序
	 * 
	 * @param map
	 * @return
	 */
	public static List<Integer> sortMapByValue(Map<String, Integer> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}
		List<Integer> list = new ArrayList<Integer>();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
				map.entrySet());
		Collections.sort(entryList, new MapValueComparator());
		Collections.reverse(entryList);
		Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
		Map.Entry<String, Integer> tmpEntry = null;
		while (iter.hasNext()) {
			tmpEntry = iter.next();
			list.add(Integer.parseInt(tmpEntry.getKey()));
			System.out.println("[ID]:" + tmpEntry.getKey() + "[count]:"
					+ tmpEntry.getValue());
		}
		return list;
	}

	private static String format(long time, String param) {

		SimpleDateFormat sdf = new SimpleDateFormat(param);
		return sdf.format(new Date(time));
	}
}
