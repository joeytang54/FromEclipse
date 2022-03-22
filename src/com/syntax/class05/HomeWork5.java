package com.syntax.class05;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules:
		 * 
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Input quiz score");
		int quiz=scan.nextInt(); 
		System.out.println("Input mid-term score");
		int midTerm=scan.nextInt(); 
		System.out.println("Input finals score");
		int finals=scan.nextInt(); 
		
	
		
		if ((quiz+midTerm+finals)/3 >=90) {
			System.out.println("Grade A");
		}else if ((quiz+midTerm+finals)/3 >=70) {
			System.out.println("Grade B");
		}else if ((quiz+midTerm+finals)/3 >=50 && (quiz+midTerm+finals)/3 <70){
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}
	}

}
