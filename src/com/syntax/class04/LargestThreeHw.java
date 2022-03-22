package com.syntax.class04;

import java.util.Scanner;

public class LargestThreeHw {
	

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested if 
		 * provided by a user and define whether the largest number is even or odd
		 * 
		 */
		
		int num1=1000; 
		int num2=2000; 
		int num3=3001; 
		
		int largest = 0; 
		
		if (num1>num2 && num1>num3) {
			largest=num1; 
		}else if (num2>num1 && num2>num3) {
			largest=num2;
	}else if (num3>num1 && num3>num2) {
		largest=num3;
			}
		System.out.println(largest);
		
		if (largest%2==0) {
			System.out.println(largest+" is an even number");
		}else {
			System.out.println(largest+ " is an odd number");
		}
		}

	}


