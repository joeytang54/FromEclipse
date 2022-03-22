package com.syntax.replit02;

public class Hw81 {

	public static void main(String[] args) {
		// Write a program that prints the highest value in the array.
		//input [5,4,8]
		
		int [] array= {5,4,8}; 
		int largest=array[0]; 
		
		for (int x=0; x<array.length; x++) {
			if (largest<array[x]) {
				largest=array[x]; 
			}
		}System.out.println(largest);

		
	}

}
