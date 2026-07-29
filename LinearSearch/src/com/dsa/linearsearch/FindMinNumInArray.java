package com.dsa.linearsearch;

public class FindMinNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 4, 6, 29, 48, 32, 90, 5 };
		System.out.println(min(arr));

	}

	static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
