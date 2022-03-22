package com.syntax.replit03;

import java.util.Scanner;

public class Hw101 {
	/*
	 * Inputs:
	 * 
	 * String word; String word; Write a for loop that will print out every other
	 * letter in a String, starting with the first letter. These letters should be
	 * printed all on one line with no space in between.
	 * 
	 * Sample input/outputs
	 * 
	 * In: hello hlo  In: SSyynnttaaxxTTeecchhnnoollooggiieess
	 * SyntaxTechnologies
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		for (int i = 0; i < word.length(); i += 2) {

			System.out.print(word.charAt(i));

		}
	}
}
