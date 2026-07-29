package com.dsa.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 45, 77, 9 }, { 3, 8, 5, 30, 66, 50 }, { 4, 7, 8, 2 }, { 24, 75, 90, 42, 66 } };
		int target = 7;

		int[] val = findNum(arr, target);
		System.out.println(Arrays.toString(val));

	}

	static int[] findNum(int[][] arr, int target) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };

	}

}
