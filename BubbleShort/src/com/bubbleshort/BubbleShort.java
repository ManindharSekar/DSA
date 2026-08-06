package com.bubbleshort;

import java.util.Arrays;

public class BubbleShort {

	// Bubble Sort is a sorting algorithm that repeatedly compares two adjacent
	// elements and swaps them if they are in the wrong order.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 4, 3 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void bubble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

}
