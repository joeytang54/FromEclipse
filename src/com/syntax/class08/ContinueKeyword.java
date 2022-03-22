package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=1; i<=7; i++) {
			if (i==3) {
				continue; //skip current interation/cycle
			}
			System.out.println("Hello "+i);
			System.out.println("We are Batch 12");
		}
			//I want to print all numbers from 1-10 expect 4
			for (int j=1; j<=10; j++) {
				if(j==4) {
					continue; 
				}
				System.out.print(j+ " ");
			}
			System.out.println("End of code");
			//I want to print all numbers from 1-10 expect 4 and 7
			for (int j=1; j<=10; j++) {
				if(j==4 || j==7) {
					continue; 
				}
				System.out.print(j+ " ");
		}
	}

	}
