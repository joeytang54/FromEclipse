package com.syntax.class09;

public class Hw3Sum {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		
		//for loop
		int [] nums= {40, 55, 28, 78, 66};
		int size=nums.length;
		int sum = 0; 
		
		for (int i=0; i<size; i++) {
			sum+=nums[i];
		}
		 
		System.out.println(sum);
		
		//enchance loop
		sum=0; 
		for (int numbers:nums) {
			sum+=numbers; 
		}
		System.out.println(sum);
	}

}
