package com.syntax.class06;

import java.util.Scanner;

public class GradeCommentHw {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");

		char grade=scan.next().charAt(0); 
		String comment; 
		switch (grade) {
		
		case 'A':
		comment="Excellent"; 
		break; 
		case 'B':
		comment="Good"; 
		break; 
		case 'C':
			comment="Average"; 
			break; 
		case'D':
			comment="Bad"; 
			break; 
			default: 
			comment="Not Acceptable"; 
		}
		System.out.println(grade+ " " +comment);
	}

}
