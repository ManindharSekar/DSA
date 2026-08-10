package com.cyclesort;

import java.util.Arrays;

public class CycleSort {

	// Cycle Sort is an in-place sorting algorithm that tries to minimize the number
	// of writes/swaps to the array.

	public static void main(String[] args) {
		int arr[] = { 4, 2, 5, 1, 3 };
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
