package com.syntax.class04;

import java.util.Scanner;

public class LoanHw {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 *
		 */

		Scanner scan= new Scanner (System.in); 
		System.out.println("What is the amount of loan reqested?");
		double loan=scan.nextDouble(); 
		

		if (loan<=200000) {
			System.out.println("Lend money to client");
			} else {
			System.out.println("Reject the client");
		}
	}
}
