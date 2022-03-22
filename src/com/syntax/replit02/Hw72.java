package com.syntax.replit02;

public class Hw72 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array with the following values{s, a, y, b,
		 * n, c, t, d, a, e, x}
		 * 
		 * Print the values so the output should look like below
		 ** 
		 * Output:** Output:** syntax
		 */

		String [] letters= {"s", "a", "y", "b", "n", "c", "t", "d", "a", "e", "x"}; 
		for (int i=0; i<11; i++)
			if (i%2==0) {
				System.out.print(letters[i]);
			}
		
	}

}
