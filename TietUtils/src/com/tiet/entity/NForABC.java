package com.tiet.entity;

public enum NForABC {

	TWO("abc"), THREE("def"), FOUR("ghi"), FIVE("jkl"), SIX("mno"), SEVEN("pqrs"), EIGHT("tuv"), NINE("wxyz");

	private String value;

	private NForABC(String value) {

		this.setValue(value);
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
