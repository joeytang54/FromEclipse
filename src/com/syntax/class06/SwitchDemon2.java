package com.syntax.class06;

public class SwitchDemon2 {

	public static void main(String[] args) {

		char choice = 'a';
		String answer;

		switch (choice) {

		case 'y':
			answer = "Yes";
			break;
		case 'n':
			answer = "No";
			break;
		case 'm':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;

		}
		System.out.println(answer);
		System.out.println("------------------");
		/*
		 * declare a variable to store a car based on the value of car define the
		 * country of origin
		 */

		String car = "Ford";
		String country;

		switch (car.toLowerCase()) {

		case "bmw":
			country = "Germany";
			break;
		case "ford":
			country = "USA";
			break;
		case "lada":
			country = "Russia";
			break;
		case "toyota":
			country = "Japan";
			break;
		default:
			country = "Unknown";

		}
		System.out.println(car + " is from " + country+ " country");
	}

}
