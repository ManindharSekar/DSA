package com.dsa.binarysearch;

public class BinarySearch {
	
/*	Whenever you see a problem with:

		A sorted array
		Need to find an element
		Need the first/last occurrence
		Need the smallest or largest value satisfying a condition

		Think:
		Can I solve this using Binary Search?*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 7, 9, 13, 16, 20, 45, 48, 90 };
		int target = 5;
		int ans = searchNum(arr, target);
		System.out.println(ans);

	}

	static int searchNum(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
