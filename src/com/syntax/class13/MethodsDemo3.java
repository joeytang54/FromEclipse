package com.syntax.class13;

public class MethodsDemo3 {
	
	/*
	 * int we specify the datatype that method will return
	 * squareTheNumber name of the method
	 * (int number) paramters of the method
	 * return tell java what to return from this method 
	 * 
	 */
	int squareTheNumber (int number) {
		return number*number; 
	}
	
	int returnTheSameNumber(int number) {
		
		return number; 
	}
	
	// create a method that takes a person name and an animal name if persons name is "Teyfur"
	// and if animal is "Horse", it return use "camel"
	String nameAndAnimal(String personName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(personName)&& "Horse".equalsIgnoreCase(animalName)) {
			return "Camel"; 
		}else if("Horse".equals(animalName)) {
			return "Horse"; 
		}else {
			return "I don't know"; 
		}
	}
	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3(); 
		int result=obj.squareTheNumber(4); //4*4 =16
		System.out.println(result);
		
		int result2=obj.returnTheSameNumber(10); 
		System.out.println(result2);
		
		System.out.println(obj.nameAndAnimal("Teyfur", "Horse"));
		System.out.println(obj.nameAndAnimal("Joey", "Luna"));
		
		
	}

}
