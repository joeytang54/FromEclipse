package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=10; 
		int num2=16; 
		
		System.out.println(num1>num2); //false
		System.out.println(num1==num2);//false
		System.out.println(num1<num2);//true
		
		boolean result=num1!=num2;
		
		System.out.println("Result is " +result);
		
		System.out.println(num1=num2);//num2(16) value assigned to num1 (from 10----> 16) 
		System.out.println(num1==num2);//comparing
		System.out.println(num1!=num2);
	}

}
