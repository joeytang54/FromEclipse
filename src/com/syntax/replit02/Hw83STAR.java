package com.syntax.replit02;

public class Hw83STAR {

	public static void main(String[] args) {
		/*
		 * Write a program that calculates the sum of elements from each row in a 2D
		 * array and adds them into array of integers 
		 * 
		 * {1,1,2}, //sum = 4 
		 * {3,1,2}, //sum = 6 
		 * {3,5,3}, //sum = 11 
		 * {0,1,2} //sum = 3
		 */

			
			int[][] a = {{1,1,2},{3,1,2},{3,5,3},{0,1,2}};
			int rows=0; 
			int columns=0; 
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < columns; j++) {
					
				}		
			}	
			
			for(int i = 0; i < a.length; i++)
			{
				int sum = 0;
				for(int j = 0; j < a[0].length; j++)
				{
					sum = sum + a[i][j];
				}
				System.out.println(sum);
			}
			
	} 
	}


