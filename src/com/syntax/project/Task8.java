package com.syntax.project;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */
		
		int [] num= {90, 45, 23, 12, 107, 37};
		//assuming 1st number is the largest number
		int largest=num[0];
		//assuming 1st number is the smallest number 
		int smallest=num[0]; 
		//iterating through all the elements
		for (int elements:num) {
			//check if we have something even bigger if yes update the largest
			if (elements>largest) {
				largest=elements; 
			}
		//checking if we have something even smaller if yes update the smallest 
			if (elements<smallest) {
				smallest=elements; 
			}
		}
		System.out.println("Largest number is "+largest);
		System.out.println("Smallest number is "+smallest);

	

}
}