package com.syntax.class07;

import java.util.Scanner;

public class FirstNameHw {

	public static void main(String[] args) {
		/*
		 * Ask a user to enter name, last name and age 5 times. Every time your program
		 * should print those values in a format “You name is _ _ and you are _ years
		 * old’
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name"); 
		String name=scan.next(); 
		System.out.println("Please enter your last name");
		String lastName=scan.next(); 
		System.out.println("Please enter your age");
		int age=scan.nextInt(); 
		
		for (int j=1; j<=5; j++) {
			System.out.println("My name is "+name+ " " +lastName+ " and I am "+age+ " years old");
		}
			
	}

}
