package com.syntax.replit03;

public class Hw106 {

	public static void main(String[] args) {
		/*
		 * Instantiate and StringBuffer class
		 * 
		 * Append Value "Hello" to it
		 * 
		 * Append value "World" to it.
		 * 
		 * Print in UPPERCASE.
		 * 
		 * Expected Output:
		 * 
		 * HELLO WORLD
		 */
		String s="Hello"; 
		s=s.concat(" "+"World"); 
		
		System.out.println(s.toUpperCase());
	}

}
