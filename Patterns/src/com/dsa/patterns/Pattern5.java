package com.dsa.patterns;

public class Pattern5 {

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pattern(n);

	}

	public static void pattern(int n) {
		for (int row = 1; row < n * 2; row++) {
			int targetCol = n < row ? 2 * n - row : row;
			for (int col = 1; col <= targetCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
