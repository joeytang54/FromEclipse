package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
		 */
	Scanner scan=new Scanner (System.in); 
	System.out.println("Please enter a number");
	long num=scan.nextLong();
	
	if (num>0 && num<=10) {
		System.out.println("Small number");
	}else if (num>10 && num<=100) {
		System.out.println("Medium number");
	}else if (num>100 && num<=1000) {
		System.out.println("Large number");
	}else {
		System.out.println("Invalid input");
	}
	
	}

}
