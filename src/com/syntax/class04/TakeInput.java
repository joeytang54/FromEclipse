package com.syntax.class04;
/*
 * To import in mac: cmd+shift+o
 */
import java.util.Scanner;


public class TakeInput {

	public static void main(String[] args) {
		
		//1. create a Scanner and assign to a variable 
		Scanner scan=new Scanner(System.in); 
		
		//2. Specify instructions
		System.out.println("Please enter where you are from");
		
		//3. we need to capture String value > use next(); 
		String country=scan.next(); 
		System.out.println("You are from "+country);
		
		//if you are from USA > you speak english
		//if you are form France > you speak French
		if (country.equalsIgnoreCase("USA")) {
			System.out.println("You speak english");
		}else if(country.equalsIgnoreCase("Franch")) {
			System.out.println("You speak french");
		}else if (country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak Turkish");
		}else {
			System.out.println("I dont know what language you speak");
		}
	}

}
