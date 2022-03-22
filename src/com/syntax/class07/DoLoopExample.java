package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/*
		 * create a secret number
		 * we want user to guess out secret number 
		 * the moment user guessed my secret number> my program should stop 
		 * otherwise it should continue asking to guess my number 
		 */
		
System.out.println("*** Using Do While******");	
		int secretNum=12; 
		Scanner scan=new Scanner (System.in); 
		int guessNum; 
		
		do {
			System.out.println("Please enter a number to win");
			guessNum=scan.nextInt(); 
		}while (guessNum!=secretNum); 
		System.out.println("Congratulations");
		
		
		
		
		
		
		
		System.out.println("***** Using While******");	
		
		int secretNum1=12; 
		Scanner scan2=new Scanner(System.in); 
		int guessNum2; 
		System.out.println("Please enter the winning numer");
		guessNum2=scan2.nextInt(); 
		
		while(guessNum2!=secretNum1) {
			System.out.println("Please enter the winning number");
			guessNum2=scan2.nextInt(); 
		}
		System.out.println("Congratulations");
		
		
		
		
	}

}
