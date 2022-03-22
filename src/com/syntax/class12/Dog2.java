package com.syntax.class12;

public class Dog2 {
	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviors.
	 */
	
	String name; 
	String breed; 
	String color; 
	int weight;
	int age; 
	char gender; 
	
	void printCompleteInfo() {
		System.out.println("Name= "+name);
		System.out.println("Breed= "+breed);
		System.out.println("Color= "+color);
		System.out.println("Weight= "+weight);
		System.out.println("Age= "+age);
		System.out.println("Gender= "+gender);
	}
	
	public static void main(String[] args) {
		Dog2 dog1=new Dog2(); 
		dog1.name="Luna"; 
		dog1.breed="Husky";
		dog1.color="white"; 
		dog1.weight=70; 
		dog1.age=2; 
		dog1.gender='F';
		dog1.printCompleteInfo();
		System.out.println("***********");
		
		Dog2 dog2=new Dog2(); 
		dog2.name="Rocky"; 
		dog2.breed="Bulldog";
		dog2.color="brown"; 
		dog2.weight=80; 
		dog2.age=3; 
		dog2.gender='M';
		dog2.printCompleteInfo();
		System.out.println("***********");
		
		Dog2 dog3=new Dog2(); 
		dog3.name="Molly"; 
		dog3.breed="Labrador";
		dog3.color="black"; 
		dog3.weight=55; 
		dog3.age=4; 
		dog3.gender='F';
		dog3.printCompleteInfo();
	}

}
