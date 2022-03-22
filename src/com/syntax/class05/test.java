package com.syntax.class05;

import java.util.Scanner;

public class test {

	/*
	 * Create a program that prompt user with question: "Do you need a loan?"(Use a
	 * boolean) If the result is true then prompt user with question:
	 * "What is your credit score?". Otherwise eligibility is "Unknown"
	 * 
	 * Based on the score define users eligibility:
	 * 
	 * if score is below 600 --> eligibility = "Not eligible" if score is between
	 * 600 and 700 inclusive --> eligibility = "Maybe eligible" if score is between
	 * 701 and 800 inclusive --> eligibility = "Eligible" if score is higher than
	 * any other previous values --> eligibility = "Definitely eligible" . Output:
	 * 
	 * The eligibility is ____
	 */

	public static void main(String[] args) {

		System.out.println("Do you need a loan?");
		Scanner scan = new Scanner(System.in);
		boolean loan=scan.nextBoolean(); 
		String answer; 
		if (loan) {
			System.out.println("What is your credit score?");
			int score=scan.nextInt(); 
		
			if (score<600) {
				answer = ("Not eligible");
			}else if (score>=600 && score<=700) {
				answer = ("May eligible");
			}else if (score>=701 && score<=800) {
				answer = ("Eligible");
			}else {
				answer = ("Definitely eligible");
			}
			System.out.println("The eligibility is "+answer);
		}else {
			System.out.println("Unknown");
		}
		
	}
}
