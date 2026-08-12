package com.cyclesort;

public class FindDuplicateNum {

	// 287. Find the Duplicate Number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 3, 3, 3, 3 };
		System.out.println(findDuplicateNum(nums));

	}

	static int findDuplicateNum(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != i + 1) {
				int correct = nums[i] - 1;
				if (nums[i] != nums[correct]) {
					swap(nums, i, correct);
				} else {
					return nums[i];
				}
			} else {
				i++;
			}
		}
		return -1;
	}

	private static void swap(int[] nums, int first, int second) {
		// TODO Auto-generated method stub
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;

	}

}
