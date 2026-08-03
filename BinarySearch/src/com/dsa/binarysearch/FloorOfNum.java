package com.dsa.binarysearch;

public class FloorOfNum {

	// Floor = The largest element in the array that is less than or equal to the
	// target.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 6, 8, 10, 15, 18, 22, 27, 50, 70 };
		int target = 1;
		int searchNum = searchNum(arr, target);
		System.out.println(searchNum);

	}

	static int searchNum(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return end;
	}

}
