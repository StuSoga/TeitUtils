package com.tiet.utils;

import java.util.ArrayList;
import java.util.List;

import com.tiet.entity.NForABC;

public class ABCUtils {

	public static String[] method(String param) {

		char[] numbers = param.toCharArray();
		List<char[]> list = new ArrayList<char[]>();
		for (char number : numbers) {

			switch (number) {
			case '2':

				list.add(NForABC.TWO.getValue().toCharArray());
				break;
			case '3':

				list.add(NForABC.THREE.getValue().toCharArray());
				break;
			case '4':

				list.add(NForABC.FOUR.getValue().toCharArray());
				break;
			case '5':

				list.add(NForABC.FIVE.getValue().toCharArray());
				break;
			case '6':

				list.add(NForABC.SIX.getValue().toCharArray());
				break;
			case '7':
				list.add(NForABC.SEVEN.getValue().toCharArray());

				break;
			case '8':
				list.add(NForABC.EIGHT.getValue().toCharArray());

				break;
			case '9':
				list.add(NForABC.NINE.getValue().toCharArray());
				break;

			}
		}

		return null;
	}
}
