package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter your country");

				String country1 = input.next();
				String language;

				switch (country1.toLowerCase()) {
				case "USA":
					language = "English";
					break;
				case "Russia":
					language = "Russian";
					break;
				case "China":
					language = "Chinese";
					break;
				case "Tukey":
					language = "Turkish";
					break;
				default:
					language = "Unknown";
				}
				
				System.out.println("I am from "+country1+ " and I speak "+language);

	}

}
