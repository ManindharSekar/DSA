package com.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	//Take one element at a time and insert it into its correct position in the already-sorted left part.

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 1 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}

	}

	private static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
