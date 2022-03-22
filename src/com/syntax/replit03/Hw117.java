package com.syntax.replit03;

public class Hw117 {
	
	int sumEvenToX(int x) {
		int sum=0; 
		for (int i=1; i<=x; i++) {
			if (i%2==0) {
				sum+=i; 
			}
		}
		return sum; 
	}

	public static void main(String[] args) {
		/*
		 * Create a method with the following specs:
		 * 
		 * Returns:
		 * 
		 * an integer Name:sumEvenToX
		 * 
		 * Parameters:an integer called "x"
		 * 
		 * Purpose:
		 * 
		 * calculate the sum of the EVEN integers from 1 to x (including x) 
		 * calculate the sum of the EVEN integers from 1 to x (including x) 
		 * Examples:
		 * 
		 * sumEvenToX(5) ==> 6 
		 * sumEvenToX(8) ==> 20
		 */
		Hw117 obj=new Hw117(); 
		System.out.println(obj.sumEvenToX(5));
		System.out.println(obj.sumEvenToX(8));
	}

}
