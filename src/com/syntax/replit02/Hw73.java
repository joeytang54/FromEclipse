package com.syntax.replit02;

public class Hw73 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of strings with the following
		 * values{"This", "is", "array", "of", "strings"} and prints all values in one
		 * line.
		 * Output: This is array of strings
		 */
		
		String [] words={"This", "is", "array", "of", "strings"}; 
		for (int i=0; i<5; i++) {
			System.out.print(words[i]+" ");
		}
	}

}
