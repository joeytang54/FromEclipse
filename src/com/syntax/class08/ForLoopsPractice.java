package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		
		System.out.println("*****MULTIPICATION TABLE********");
		
	/*
	 * 3X1=3
	 * 3X2=6
	 * 3x3=9
	 */
		
	int num=3; 
	int result; 
	
	for (int i=1; i<=10; i++) {
		result=num*i; 
		System.out.println(num+ " X "+i+" = "+result);
	}
	System.out.println("WHAT IS THE OUTPUT");

	
/*
 * I want to find out the sum of all even and all odd numbers from 1 to 50
 */
	int sumEven=0; 
	int sumOdd=0; 
	
	for (int i=1; i<=50; i++) {
		if (i%2==0) {
			sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+i; 
		}
	}System.out.println(sumEven);
	System.out.println(sumOdd);
	}

}
