package com.syntax.project;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not? 
		 */

		Scanner scan=new Scanner(System.in); 
		 
		System.out.println("Please select a number ");
		int num=scan.nextInt();
		
		if (num%2!=0 && num%3!=0 && num) {
		System.out.println(num+ " is not a prime number");
		}else {
			System.out.println(num+" is a prime number");
			
		}
		
	}

}
