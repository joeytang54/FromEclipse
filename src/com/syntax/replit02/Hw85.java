package com.syntax.replit02;

public class Hw85 {

	public static void main(String[] args) {
		// Write a program that sums all numbers that are on even index and on even row.
		/*
		 * {-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		 */
		int sum = 0; 
		int [][] array= {{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}}; 
		for (int row=0; row<array.length; row++) {
			for (int col=0; col<array[row].length; col++)	
			if (row%2==0 && col%2==0 ) {
			
				sum+=array[row][col]; 
			}
		}System.out.println(sum);

	}

}
