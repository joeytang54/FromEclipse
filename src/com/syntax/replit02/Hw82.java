package com.syntax.replit02;

public class Hw82 {

	public static void main(String[] args) {
		// Write a program that will print the sum of all elements in 2D array.
		/*
		 * {-5,-2,-3,7}, {1,-5,-2, 2}, {1,-2, 3,-4}
		 */

		int[][] array = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		 
		int sum = 0; 
		
		for (int i=0; i<array.length; i++) {//row
			for (int j=0; j<array[i].length; j++) {//column
				sum+=array[i][j]; 
				
			}
		}
		System.out.println(sum);
		
	}

}
