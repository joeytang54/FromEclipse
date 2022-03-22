package com.syntax.replit03;

public class Hw116 {
	boolean numbers(int num1, int num2) {
		if (num1%2==0 && num2%2==0) {
			return true; 
			
		}else {
			return false; 
		}
	}

	public static void main(String[] args) {
		/*
		 * Create a method that will accept 2 numbers as parameters and return true if
		 * both numbers are even otherwise returned false
		 * 
		 * ( Return false if one or both given numbers are not even)
		 * 
		 * Examples:
		 * 
		 * bothEven(4,6) ==> true 
		 * bothEven(3,4) ==> false 
		 * bothEven(-1,1) ==> false
		 */
		Hw116 obj=new Hw116(); 
		System.out.println(obj.numbers(4, 6)); 
		System.out.println(obj.numbers(3, 4));
		System.out.println(obj.numbers(-1, 1));
	}

}
