package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {
	
	// VOID is a type of methods that don't return anything when called 
	// checkEvenOdd is the name of the method
	// () is the syntax we use to pass information from outside 
	// int number: this is parameter that we can pass this method when called
	// we can use this variable inside the logic of method
	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else if (number%2!=0) {
			System.out.println("Odd");
		}
		
	}
	void rainOrNot (boolean isRain) {
		if (isRain) {
			System.out.println("Take umbrella");
		}else {
			System.out.println("Let's go for a walk");
		}
	}
	
	void checkName(String name) {
		if (name.equalsIgnoreCase("Teyfur")) {
			System.out.println("Let's send MEMES");
		}else {
			System.out.println("Let's focus on Java class");
		}
	}
	
	public static void main (String[]args) {
	MethodsDemo1 object1=new MethodsDemo1(); 
	object1.checkEvenOdd(12); //Even
	object1.checkEvenOdd(27); //odd
	
	
	object1.rainOrNot(true); //Take Umbrella
	
	
	object1.checkName("Teyfur");//Let's send MEMES
	object1.checkName("Joey");//Let's focus on Java

	
	Scanner scan=new Scanner(System.in); 
	int number=scan.nextInt(); //nextInt() stores the value in number
	//int number2=object1.checkEvenOdd(120); 
	}
	
	
}
