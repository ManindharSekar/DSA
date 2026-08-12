package com.cyclesort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateInArray {

	// 442. Find All Duplicates in an Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findAllDuplicatesInArray(nums));

	}

	static List<Integer> findAllDuplicatesInArray(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		List<Integer> ans = new ArrayList<Integer>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(nums[index]);
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
