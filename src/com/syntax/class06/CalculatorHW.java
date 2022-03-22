package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
		/*
		 * HW: Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 * Please complete this assignment in 2 ways: using if statement and switch
		 * case.Ï
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("Input operator: +, -, *, /, %");
		char operator = scan.next().charAt(0);

		if (operator=='+') {
			System.out.println(num1 + num2);
		} else if (operator=='-') {
			System.out.println(num1 - num2);
		} else if (operator=='/') {
			System.out.println(num1 / num2);
		} else if (operator=='*') {
			System.out.println(num1 * num2);
		} else if (operator=='%') {
			System.out.println(num1 % num2);
		} else {
			System.out.println("Invalid input");
		
		}
	}

}
