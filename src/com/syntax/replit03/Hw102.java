package com.syntax.replit03;

import java.util.Scanner;

public class Hw102 {

	public static void main(String[] args) {
		/*
		 * Write a for loop that will loop through every character of a word and print
		 * out each character, each on a separate line
		 * In: hello
h
e
l
l
o
		 */
		
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    
		    for (int i=0; i<word.length(); i+=2) {
		    	System.out.println(word.charAt(i)+"");
		    }

	}

}
