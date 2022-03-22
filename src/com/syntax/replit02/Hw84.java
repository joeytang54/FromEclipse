package com.syntax.replit02;

public class Hw84 {

	public static void main(String[] args) {
		// Write a program that prints the total number of elements that are negative
		// AND odd
		/*
		 * {-5,-2,-3,7}, {1,-5,-2,2}, {1,-2,3,-4}
		 * 
		 */
		
		int [][] array= {{-5,-2,-3,7}, {1,-5,-2,2}, {1,-2,3,-4}}; 
		int oddNeg = 0; 
		
		for (int[] elements:array) {
			for (int num:elements) {
			if (num<0 && num%2!=0) {
				oddNeg++; 
				
			}
		}
		}System.out.println(oddNeg);
	}
}


