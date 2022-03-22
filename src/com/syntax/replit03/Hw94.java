package com.syntax.replit03;

public class Hw94 {

	public static void main(String[] args) {
		/*
		 * Create a String given="I love Java classes at Syntax" Retrieve 2 Strings
		 * using substring method from given String and print them 
		 * 
		 * Expected Output:
		 * 
		 * classes at Syntax
		 * 
		 * I love Java
		 */
		String given="I love Java classes at Syntax"; 
		
		System.out.println(given.substring(12));
		System.out.println(given.substring(0,11));
	}

}
