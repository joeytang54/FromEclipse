package com.syntax.replit02;

public class Hw75 {

	public static void main(String[] args) {
		/*
		 * Using the following array.
		 * 
		 * {45, 78, 12, 67, 55, 89, 23, 77, 88}
		 * 
		 * Create a for loop to extract values from that array so your output looks as
		 * below:
		 * Expected Output:** 78 55 77
		 */
		
		int[] nums={45, 78, 12, 67, 55, 89, 23, 77, 88}; 
		int size=nums.length; //9
		for (int i=1; i<size; i++) {
			System.out.println(nums[i]);
			i+=2; 
		}
			
	}

}
