package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// Logical not is used to revert the condition
		
		boolean value=!true; //not true
		System.out.println(value);
		
		boolean traffic=true; 
		
		if(!traffic) {
			System.out.println("I will come on time to work");
		}
		
		System.out.println("------------------");
		
		String day="Saturday";
		if (!day.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}
	
		boolean checkboxChecked=false; 
		if (!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		
		}
		System.out.println("----------------------------");
		
		String java="easy"; 
		if (!java.equals("hard")) {
			System.out.println("You are genius");
		}
		
		System.out.println("----------The END-----------------");

	}

}
