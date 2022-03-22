package com.syntax.replit03;

import java.util.Scanner;

public class Hw99 {
	
			
		public static void main(String[] args) {
		/*
		 * Write code that will take in a String input and check to see if it is a
		 * palindrome or not.
		 * 
		 * A palindrome means that the characters are the same forwards and backwards,
		 * ignoring spaces.
		 * 
		 * Examples of palindromes:
		 * 
		 * racecar 
		 * was it a car or a cat I saw 
		 * never odd or even 
		 * rats live on no evil star 
		 * Your check should be case insensitive too. For example, "Bob" is a
		 * palindrome, despite the first B being capitalized.
		 * 
		 * Your program will print out "true" if it's a palindrome and "false" if not.
		 */
		
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine(); 
		    
		    Hw99 obj=new Hw99(); 
		    System.out.println(obj.isPalindrome(givenString.replaceAll(" ","")));
		    
		    boolean isPalindrome(String inputStr) {
		        return reverseString(inputStr).equals.IgnoreCase(inputStr); 
		        }
			   String reverseString(string inputStr) {
				   return new StringBuilder(input).reverse().toSting(); 
			   }
		        
		        
		    	
		    
		    
	}

}
