package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//next() vs nextLine(); 
		Scanner scan=new Scanner(System.in); 
		System.out.println("Capturing values using next");
		String value=scan.next(); 
		//nextInt(); nextDouble(); nextBoolean(); next().charAT(0); 
		
		System.out.println(value);
		
		scan.nextLine(); //this needs to be add inorder to print nextLine, right after next form the preivous line
		 
		System.out.println("Capturing values using nextLine");
		String value2=scan.nextLine();
		System.out.println(value2);
	}

}
