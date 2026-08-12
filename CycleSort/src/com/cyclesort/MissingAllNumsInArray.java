package com.cyclesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAllNumsInArray {

	// 448. Find All Numbers Disappeared in an Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		System.out.println(missingAllNum(nums));
	}

	static List<Integer> missingAllNum(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		List<Integer> ans = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(index + 1);
			}
		}
		return ans;
	}

	private static void swap(int[] nums, int first, int second) {
		// TODO Auto-generated method stub
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;

	}

}
