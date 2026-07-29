package com.dsa.linearsearch;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Manindhar";
		char target = 'd';
		System.out.println(searchCharInString(name, target));
		System.out.println(searchCharInString2(name, target));
		System.out.println(Arrays.toString(name.toCharArray()));

	}

	static boolean searchCharInString(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}

	static boolean searchCharInString2(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		for (char c : str.toCharArray()) {
			if (c == target) {
				return true;
			}
		}
		return false;
	}

}
