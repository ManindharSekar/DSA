package com.dsa.linearsearch;

public class SearchInNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 66, 23, 95, 228, 5, 74, 9, 10 };
		int target = 74;
		System.out.println(linearSearch(arr, target));
		System.out.println(linearSearch2(arr, target));
		System.out.println(linearSearch3(arr, target));

	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return element;
			}
		}
		return -1;

	}

	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		}
		return -1;

	}

	static boolean linearSearch3(int[] arr, int target) {
		if (arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return true;
			}
		}
		return false;   
	}

}
