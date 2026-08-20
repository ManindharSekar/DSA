package com.dsa.patterns;

public class Pattern1 {

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pattern(n);

	}

	public static void pattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
