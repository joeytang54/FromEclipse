package com.syntax.class07;

import java.util.Scanner;

public class CoffeeCandyHw {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask user to pay for a
		 * coffee. Keep asking to pay for coffee until user enters exact amount . If
		 * user give more than price --> ask them to give less, if user gives less money
		 * then ask to give more. Once user got a write amount print “Please enjoy your
		 * candy”
		 */

		int coffeePrice = 3;
		System.out.println("Please pay for your coffee");
		Scanner scan = new Scanner(System.in);

		int price;

		do {

			price = scan.nextInt();

			if (price > coffeePrice) {
				System.out.println("Give less money");
			} else if (price < coffeePrice) {
				System.out.println("Give more money");
			}

		} while (price != coffeePrice);

		System.out.println("Please enjoy your coffee");

	}

}
