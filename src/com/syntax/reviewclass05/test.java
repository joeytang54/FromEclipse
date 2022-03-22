package com.syntax.reviewclass05;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a JavaScript program that accept two integers and display the larger
		
		int []num= {10, 35}; 
		int larger=num[0]; 
		
		for (int i=1; i<num.length; i++) {
			if (larger<num[i]) {
				larger=num[i]; 
			}System.out.println(larger);
		}
		
		
	}

}
