package com.syntax.replit03;

import java.util.Scanner;

public class Hw104 {

	public static void main(String[] args) {
		/*
		 * Create an array of names that will hold 5 String elements.
		 * 
		 * Names must be taking from a user.
		 * 
		 * Print out the first three characters of each element of the array, one per
		 * line.
		 * 
		 * Note: every array element must be at least 3 characters long.
		 * 
		 * Input Example:
		 * 
		 * John
		 * 
		 * Jane
		 * 
		 * Jimmy
		 * 
		 * Mike
		 * 
		 * Emily
		 * 
		 * Expected Output: Expected Output: Joh
		 * 
		 * Jan
		 * 
		 * Jim
		 * 
		 * Mik
		 * 
		 * Emi
		 */
		Scanner scan=new Scanner (System.in); 
		String[] names=new String[5]; 
		for (int i=0; i<5; i++) {
	     names[i] =scan.next(); 
		}
	for (String eachname:names) {
		System.out.println(eachname.substring(0,3));
		
	}
}
}
