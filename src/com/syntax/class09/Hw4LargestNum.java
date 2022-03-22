package com.syntax.class09;

public class Hw4LargestNum {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 */
		
		int[] nums= {45, 99, 73, 60}; 
		int largest=nums[0]; //assuming 45 is the largest
		
		for (int i=1; i<nums.length; i++) { //
			if (nums[i]>largest) {	
				largest=nums[i]; 
			}
		}
		System.out.println(largest);
		
		
		// enchance for loop
		
		largest =nums[0]; 
		for (int numbers :nums) {
			if (numbers>largest) {
				largest=numbers; 
			}
		}
		System.out.println(largest);
	}

}
