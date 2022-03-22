package com.syntax.class02;

public class ClassWork {

	public static void main(String[] args) {

		/*
		 * Shortcut for format code: crtl+ shift+f
		 * 
		 */
		double num1 = 30;
		double num2 = 8;

		double sum = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double multiple = num1 * num2;
		double remainder = num1 % num2;

		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		System.out.println("The mutiples of 2 numbers " + num1 + " and " + num2 + " is equal to " + multiple);
		System.out.println("The remainder of 2 numers " + num1 + " and " + num2 + " is equal to " + remainder);

		System.out.println("**************");

		double num4 = 3.9;

		double square = num4 * num4;

		System.out.println("The square of " + num4 + " is " + square);

		System.out.println("**************");

		int width = 5;
		int height = 8;

		int perimeter = 2*(width + height);
		int area = width * height;

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);

	}

}
