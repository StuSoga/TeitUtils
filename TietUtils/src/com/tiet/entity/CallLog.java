package com.tiet.entity;


public class CallLog {

	public static final int CALL_OUT = 2;
	public static final int CALL_IN = 1;
	public static final int CALL_MISS = 3;// 未接

	private int logID;
	// 名字
	private String name;
	// 电话号码
	private String number;
	// 记录的类型 来电 去电 未接
	private int callType;
	// 通话 时间
	private long date;
	// 通话时长
	private long duration;

	/**
	 * @return the logID
	 */
	public int getLogID() {
		return logID;
	}

	/**
	 * @param logID
	 *            the logID to set
	 */
	public void setLogID(int logID) {
		this.logID = logID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the callType
	 */
	public int getCallType() {
		return callType;
	}

	/**
	 * @param callType
	 *            the callType to set
	 */
	public void setCallType(int callType) {
		this.callType = callType;
	}

	/**
	 * @return the date
	 */
	public long getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(long date) {
		this.date = date;
	}

	/**
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}


}
