package com.syntax.replit02;

public class Hw87 {
	/*
	 * Create a class named 'Main' with specific attributes.
	 * 
	 * Create two objects of that class in which you will be assigning the following
	 * values and then print them.
	 * 
	 * carColor='Black'
	 * 
	 * carYear=2019
	 * 
	 * carMake='BMW'
	 * 
	 * carColor='White'
	 * 
	 * carYear=2018
	 * 
	 * carMake='Toyota'
	 * Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
	 */

	String carColor;
	int carYear;
	String carMake;

	void printCompleteInfo() {
		System.out.print("Car color is "+carColor );
		System.out.print(" and car year is "+carYear);
		System.out.print(" and car model is "+carMake);
	}
	
	public static void main(String[] args) {
		Hw87 car1=new Hw87(); 
		car1.carColor="Black"; 
		car1.carYear=2019; 
		car1.carMake="BMW"; 
		car1.printCompleteInfo(); 
		System.out.println();
		Hw87 car2=new Hw87(); 
		car2.carColor="White"; 
		car2.carYear=2018; 
		car2.carMake="Toyota"; 
		car2.printCompleteInfo();
	}

}
