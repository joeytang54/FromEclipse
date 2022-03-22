package com.syntax.class06;

import java.util.Scanner;

public class CleanExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in); 
		System.out.println("Input the 1st number");
		
		int num1=scan.nextInt(); 
		
		System.out.println("Input the 2nd number");
		int num2=scan.nextInt();
		
		System.out.println("Input the 3rd number");
		int num3=scan.nextInt();
		
		if (num1>num2){
		if (num1>num3) {
				System.out.println(+num1+ " is the largetest number ");
			}
		}if (num2>num1) {
			if (num2>num3) {
				System.out.println(+num2+ " is the largetest number ");	
			}if (num3>num1) {
				if (num3>num2) {
					System.out.println(+num3+ " is the largetest number ");
				}
	}
		}
	}
}
