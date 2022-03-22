package com.syntax.replit02;

import java.util.Scanner;

public class Hw78 {

	public static void main(String[] args) {
		/*
		 * Create an int array of integers with a size of 5 and input values with
		 * Scanner.
		 * 
		 * Don't print prompt questions for a user.
		 * 
		 * Using loop print out each element of the array that should look like the
		 * output below
		 * 1, 2, 3, 4, 5
		 * 10, 20, 30, 40, 50
		 */
		Scanner scan=new Scanner(System.in); 
		System.out.println("Input 1st number");
		int n1=scan.nextInt(); 
		System.out.println("Input 2nd number");
		int n2=scan.nextInt(); 
		System.out.println("Input 3rd number");
		int n3=scan.nextInt(); 
		System.out.println("Input 4th number");
		int n4=scan.nextInt(); 
		System.out.println("Input 5th number");
		int n5=scan.nextInt(); 
		
		int [] numbers= {n1, n2, n3, n4, n5}; 
		for (int x=0; x<numbers.length; x++) {
			System.out.println(numbers[x] *10);
		}
		
	}

}
