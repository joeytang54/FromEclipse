package com.syntax.class13;

public class MethodsDemo2 {
// create a method that takes an animal name and person name if name is equal to Teyfur and animal is Horese
	// print camel otherwise print horse
	void TeyfurAndHorse(String personName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(personName)&& "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a camel");
			
		}else if("Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a horse");
		}
	
	}
	
	public static void main(String[] args) {
		MethodsDemo2 obj=new MethodsDemo2(); 
		obj.TeyfurAndHorse("Teyfur", "Horse");// camel
		obj.TeyfurAndHorse("Tarki", "Horse"); //horse
		
	}

}
