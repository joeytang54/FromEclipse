package com.syntax.class07;

import java.util.Scanner;

public class LastFirstNameHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 5; j++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your name");
			String name = scan.next();
			System.out.println("Please enter your last name");
			String lastName = scan.next();
			System.out.println("Please enter your age");
			int age = scan.nextInt();
			
			
			System.out.println("My name is " + name + " " + lastName + " and I am " + age + " years old");
		}
	}

}
