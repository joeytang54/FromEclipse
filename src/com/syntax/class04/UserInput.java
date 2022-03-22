package com.syntax.class04;

import java.util.Scanner;// we need to import Scanner into our class

public class UserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// we are creating a Scanner
		
		System.out.println("Please input your name");
		
		//if you want to capture single String > use next (); 
		String name=input.next(); // type String and hit enter 
		System.out.println("Your name is "+name);
		
		
	}

}
