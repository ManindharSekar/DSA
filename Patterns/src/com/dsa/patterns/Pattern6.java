package com.dsa.patterns;

public class Pattern6 {

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pattern(n);

	}

	public static void pattern(int n) {
		for (int row = 1; row < n * 2; row++) {
			int totalColInRow = row > n ? 2 * n - row : row;
			int colSpace = n - totalColInRow;
			for (int s = 0; s < colSpace; s++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
