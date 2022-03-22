package com.syntax.replit03;

import java.util.Scanner;

public class Hw96 {
	String valueCheck(String value) {
		if (value.equalsIgnoreCase("Java")) {
			return ("Java is a programming language"); 
		}else if (value.equalsIgnoreCase("C")) {
			return ("C is a procedural programming language");
		}else if (value.equals("C++")) {
			return("C++ is a middle-level programming language"); 
		}else {
			return ("Doesn't match any programming language");
		}	
		}
	

	public static void main(String[] args) {
		/*
		 * You have Scanner class to input string value.
		 * 
		 * If language is Java it should print the:
		 * 
		 * "Java is a programming language".
		 * 
		 * If language is C it should print the:
		 * 
		 * "C is a procedural programming language"
		 * 
		 * If language is C++ it should print the:
		 * 
		 * "C++ is a middle-level programming language"
		 * 
		 * If any other should print:
		 * 
		 * "Doesn't match any programming language"
		 */
		Scanner scan=new Scanner (System.in); 
		String value=scan.next(); 
		
		Hw96 obj=new Hw96();
		System.out.println(obj.valueCheck(value));
		

}
}