package com.dsa.linearsearch;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] accounts = { { 45, 78, 39 }, { 36, 89, 657, 99 }, { 648, 13, 123, 2 } };
		System.out.println(maximumWealth(accounts));

	}

	public static int maximumWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		for (int[] account : accounts) {
			int sum = 0;
			for (int acc : account) {
				sum += acc;
			}
			if (sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}

}
