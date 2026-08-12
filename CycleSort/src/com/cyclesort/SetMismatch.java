package com.cyclesort;

import java.util.Arrays;

public class SetMismatch {

	// 645. Set Mismatch

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 4 };
		System.out.println(Arrays.toString(setMismatch(nums)));

	}

	static int[] setMismatch(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				return new int[] { nums[index], index + 1 };
			}
		}
		return new int[] { -1, -1 };
	}

	private static void swap(int[] nums, int first, int second) {
		// TODO Auto-generated method stub
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}

}
