package com.syntax.replit02;

public class Hw80 {

	public static void main(String[] args) {
		/*
		 * Write a program to double the values of every element in the array and print
		 * it out.
		 * 
		 * Example Output:
		 * 2.8 4.0 6.6 4.0 
		 * 8.0 3.0 12.2 2.0 
		 * 2.4 6.2 8.0 3.2
		 */
		double[][] array= {{2.8, 4.0, 6.6, 4.0},{8.0, 3.0, 12.2, 2.0},{2.4, 6.2, 8.0, 3.2}};
		for (int x=0; x<array.length; x++) {
			for (int y=0; y<array[x].length; y++) {
				System.out.print(array[x][y]+" ");
			}System.out.println(" ");
		}
	}

}
