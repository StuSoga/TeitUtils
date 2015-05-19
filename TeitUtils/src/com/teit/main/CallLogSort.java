package com.teit.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.teit.entity.CallLog;

/**
 * 
 * @detail 通讯详情排序
 * @author 今朝惜客
 * @date 2015年5月17日下午10:44:35
 *
 */
public class CallLogSort {

	public static Map<String, List<CallLog>> nativeSort(List<CallLog> logs) {

		List<CallLog> logList = null;

		String key="";
		Map<String, List<CallLog>> map = new LinkedHashMap<String, List<CallLog>>();
		for (CallLog log : logs) {

			key = (log.getLogID() + "").trim();
			if (map.get(key) == null) {

				logList = new ArrayList<CallLog>();
			} else {

				logList = map.get(key);
			}

			logList.add(log);
			map.put(key, logList);
		}

		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<?, ?> entity = (Entry<?, ?>) it.next();
			System.out.println("ID:" + entity.getKey());
			logList = (List<CallLog>) entity.getValue();
			for (CallLog callLog : logList) {

				String callType = null;
				switch (callLog.getCallType()) {
				case 1:
					callType = "来电";
					break;
				case 2:
					callType = "去电";

					break;
				case 3:
					callType = "未接";

					break;

				}
				System.out.println("[" + callType + "]" + callLog.getDate()
						+ "[phone]" + callLog.getNumber());
			}
		}

		return map;
	}
}
