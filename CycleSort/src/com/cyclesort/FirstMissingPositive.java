package com.cyclesort;

public class FirstMissingPositive {
	
	//41. First Missing Positive

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 7, 8, 9, 11, 12 };
		System.out.println(firstMissingPositive(nums));

	}

	static int firstMissingPositive(int nums[]) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				return index + 1;
			}
		}
		return nums.length - 1;
	}

	private static void swap(int[] nums, int first, int second) {
		// TODO Auto-generated method stub
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;

	}

}
