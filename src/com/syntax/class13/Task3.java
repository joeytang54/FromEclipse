package com.syntax.class13;

public class Task3 {
	/*
	 * Create a method that will say Hello in different language based on the
	 * country that will passed when method is executed.
	 */
	
	String sayHello(String country) {
		country=country.toLowerCase(); 
		
		switch (country) {
		case "USA":
			return "Hello"; 
			
		case"France":
			return"Bonjour"; 
				 
		case "Turkey":
			return"Merhaba"; 
			
		default:
			return "I dont know";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 object=new Task3(); 
		String country=object.sayHello("USA"); 
		System.out.println(country);
		
	}

}
