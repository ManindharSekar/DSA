package com.dsa.binarysearch;

public class OrderAgnosticBS {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int asc[] = { 3, 5, 7, 9, 13, 16, 20, 45, 48, 90 };
		int desc[] = { 88, 84, 70, 64, 40, 36, 20, 9, 5, 2 };
		int target = 84;
		int ans = searchNum(desc, target);
		System.out.println(ans);

	}

	static int searchNum(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean asc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (asc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

}
