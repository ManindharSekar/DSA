package com.dsa.linearsearch;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 6, 29, 48, 32, 90, 5 };
		int target = 48;
		System.out.println(linearSearch(arr, target, 2, 5));

	}

	static int linearSearch(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = start; i < end; i++) {
			int element = arr[i];
			if (element == target) {
				return element;
			}
		}
		return -1;
	}

}
