package com.syntax.replit02;

import java.util.Scanner;

public class HW77 {

	public static void main(String[] args) {
		/*
		 * 
		 * Create an array of integers that will store 5 elements taken from a user
		 * Don't print any prompt message for the user
		 * Then print out all the elements you have created in the first loop in reverse
		 * order.
		 */
		System.out.println("Input number 1"); 
		Scanner scan=new Scanner (System.in); 
		int num1=scan.nextInt();
		System.out.println("Input number 2 "); 
		int num2=scan.nextInt();
		System.out.println("Input number 3 "); 
		int num3=scan.nextInt();
		System.out.println("Input number 4 "); 
		int num4=scan.nextInt();
		System.out.println("Input number 5 "); 
		int num5=scan.nextInt();
		
		int [] numbers= {num1, num2, num3, num4, num5}; 
		for (int x=numbers.length-1; x>=0; x--) {
			System.out.println(numbers[x]+ " ");
		}
		}
	}


