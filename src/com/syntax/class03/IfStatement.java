package com.syntax.class03;

public class IfStatement {
 public static void main(String[] args) {
	 /* 
	  * Scenario: I need to compare 2 numbers and I have to find which is bigger
	  */
	 
	 int num1=100; 
	 int num2=50;
	
	if (num1>num2) {
		System.out.println(num1+ " is larger than "+num2);
		}
	
	double money=5; 
	double coffee=5.5; 
	//If I have more money than the price of the coffee > I am buying coffee
	
	if (money>=coffee) {
		System.out.println("I am buying coffee.");
	}
		
	//if (money=coffee) {ERROR because if condition always MUST be boolean
	//we used double value (wrong operator)
	
	if (money==coffee) {
		System.out.println("I am buying coffee!");
	}
	else { System.out.println("I am not buying coffee.");
	}
	
}
}
