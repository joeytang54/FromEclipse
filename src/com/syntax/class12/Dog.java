package com.syntax.class12;

public class Dog {
	
	String name; 
	String color; 
	String breed; 
	char gender; 
	int age; 
	double weight; 
	//behaviors, functions and methods 
	void bark() {
		System.out.println("Dog is barking...");
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	public static void main(String[] args) {
		// creating an object luna from class Dog
		Dog luna=new Dog(); 
		//Dog is a class
		//luna is an object
		//=is an assignment operator
		//new is keyword that we use to create the objects of a class
		//Dog() we are calling the constructor of the class
		//Scanner scan=new Scanner(System.in); 
		luna.bark(); 
		luna.sleep(); 
		luna.eat(); 
	}

}
