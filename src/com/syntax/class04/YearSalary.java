package com.syntax.class04;

import java.util.Scanner;

public class YearSalary {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers of worked years");

		int year = scan.nextInt();
		System.out.println("I have been worked for " + year + " years");
		if (year >= 5) {
			System.out.println("You are eligible for the bonus");

			System.out.println("Enter annual salary");
			int salary = scan.nextInt();
			System.out.println("My annual salary is " + salary);

			if (salary >= 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
