package com.syntax.class09;

public class Hw1Car {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */

		String[] cars = { "Toyota", "Honda", "BMW", "Ford", "Subaru", "Tesla" };

		// for each loop
		for (String brand : cars) {
			System.out.println(brand);
		}

		System.out.println("------ Another way------");

		// regular loops
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
