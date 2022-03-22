package com.syntax.class06;

import java.util.Scanner;

public class DiscountHW {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no if there is no
		 * sale --> you are not going for shopping if there is sale ask you user for the
		 * price of the item
		 * 
		 * Based on the price you have to calculate the price of the item after the
		 * discount
		 * 
		 * if price is less than $20 --> apply 10% discount if price is between $20 &
		 * $100 --> 20% discount if price between $100 & $500 --> 30% discount otherwise
		 * apply 50% discount
		 * 
		 * Output of the program should be:
		 * 
		 * After discount ___ the price of the item reduce from __ to ___
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale? yes or no");
		String sale=scan.next();

		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What's the price of the item?");
		double price = scan.nextInt();
		double discount;
		 
		
		if (price < 20) {
			discount=10; 
			
		} else if (price >= 20 && price < 100) {
			discount=20;
		} else if (price >= 100 && price < 500) {
			discount=30;
		} else {
			discount=50;
		}
		double disPrice=(price*discount/100);
		
		System.out.println("After discount "+discount+ " % the price the item reduce from "+price+ " to " +disPrice);
	}else if (sale.equalsIgnoreCase("no")){

		System.out.println("There is no sale");
		System.out.println("Not buying anything");
	}

}

}
