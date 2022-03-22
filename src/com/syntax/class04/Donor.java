package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		/*
		 * In order to be eligible to donate your blood you have to be 18 years old.
		 * Also once you identify age eligibility then we have to see if person matches
		 * weight requirements. If person weight it more than 110 lbs then he/she is
		 * eligible, otherwise we cannot accept such a patient.
		 */

		int age = 17;
		int weight = 100;

		if (age >= 18) {
			System.out.println("You are eligible");

			if (weight >= 110) {
				System.out.println("You are eligible");
			} else {
				System.out.println("Cannot accept patient, go eat more");
			}
		} else {
			System.out.println("You are not eligible wait till you turn 18");
		}
	/*
	 * Else block cannot exist by itself
	 * else {
	 * System.out.println("Condition is false"); 
	 * }
	 */

	}

}
