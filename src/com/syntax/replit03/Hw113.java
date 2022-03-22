package com.syntax.replit03;

public class Hw113 {
	
	int hours; 
	int minutes; 
	

	public static void main(String[] args) {
		/*
		 * Step1: Create a method that will accept with 2 parameters of integer type
		 * 
		 * Step2: Write the logic in that method in println statement to print hours and
		 * minutes
		 * 
		 * Step3: Call the method
		 * 
		 * Expected Output:
		 * 
		 * 11:30
		 */
		Hw113 obj=new Hw113(); 
		obj.hours=11; 
		obj.minutes=30; 
		
		System.out.print(obj.hours);
		System.out.print(":");
		System.out.println(obj.minutes);


	}

}
