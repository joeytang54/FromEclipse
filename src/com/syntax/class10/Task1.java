package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// create an array and retrieve all elements in reverse order
		
		int nums[]= {45,55,65,75,85}; 
		
		// in regular order 
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		
		}
		// reverse
		for (int i=nums.length-1; i>=0; i--) {
			System.out.println(nums[i]);
		}
		
	}

}
