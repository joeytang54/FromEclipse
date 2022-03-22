package com.syntax.class07;

public class CalculatorUsingIf {

	public static void main(String[] args) {
		
	int num=10; 
	num=num+1; //10+1
	num+=1; //11+1
	num++; //12+1
	
	System.out.println(num);//13
	//increment operator add 1 to variable 
	
	num++; 
	System.out.println(num);//14
	
//10++; CE: Invalid argument to operation ++/--
	// decrement operator subtract 1 from a variable 
	
	num--; //14-1
	num--; //13-1
	num--; //12-1
	System.out.println(num);

	}

}
