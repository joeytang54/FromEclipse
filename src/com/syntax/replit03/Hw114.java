package com.syntax.replit03;

public class Hw114 {
	
	int addition(int num1, int num2){
		return num1+num2; 
		
	}
	int multiply(int num1, int num2){
		return num1*num2;
		
	}
	int subtract(int num1, int num2){
		return num1-num2; 
	}
	


	public static void main(String[] args) {
		/*
		 * Step1: Create three methods that will accept 2 in parameters on integer type
		 * 
		 * Step2: Write the logic in methods to perform actions below:
		 * 
		 * The first method for multiplication
		 * 
		 * The second method for addition
		 * 
		 * The third method for subtraction
		 * 
		 * Step3: execute all methods
		 * 
		 * for the addition method add two numbers to make 30
		 * 
		 * for multiplication multiply two numbers to make 30
		 * 
		 * for Subtraction subtract two numbers to equal 20
		 */
		Hw114 obj=new Hw114(); 
		System.out.println("Addition "+obj.addition(20, 10)); 
		System.out.println("Multiplication " +obj.multiply(3, 10)); 
		System.out.println("Subtration "+ obj.subtract(30,10)); 
	}

}
