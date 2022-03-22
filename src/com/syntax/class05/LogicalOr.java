package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		String day = "Saturday";

		if (day.equals("Saturday") && day.equals("Sunday")) {
			System.out.println("I have java class");
		}
		System.out.println("Code outside of if statement");

		/*
		 * let's ask user what is today's day base on the day, lets define which class
		 * we have if (Mon or Fri) --> There is no class today else if (Tue or Wed) -->
		 * manual else if(Thu) --> review else if (Sat or Sun) --> java
		 */

		Scanner scan = new Scanner(System.in);
		String day2 = scan.next();
		System.out.println("What is today's day? ");
		
		day2 =scan.nextLine(); 

		if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("We have Java class");
		} else if (day2.equals("Monday") || day2.equals("Friday")) {
			System.out.println("There is no class");
		} else if (day2.equals("Thursday")) {
			System.out.println("We have review class");

		} else if (day2.equals("Tuesday") || day2.equals("Wednesday")) {
			System.out.println("We have manual calss");
		}else {
			System.out.println("Invalid input");
		}

	}

}
