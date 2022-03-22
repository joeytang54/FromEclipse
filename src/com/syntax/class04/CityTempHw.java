package com.syntax.class04;

import java.util.Scanner;

public class CityTempHw {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city __ is __”
		 */
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("Please input city ");
		
		String city=scan.nextLine(); 
		
		System.out.println("I am in " +city);
		
		System.out.println("Please input temp in Fahrenheit");
		int temp=scan.nextInt();
		int celcius=((temp-32)*5/9); 
		
		System.out.println("The temperature in the city is " +celcius+ " Celsius");

	}
 
}
