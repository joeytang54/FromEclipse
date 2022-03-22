package com.syntax.class10;

public class Task2 {
	public static void main(String[] args) {
/*
 * Create an array of countries. While retrieving all values from and array print
 * capital for each country.
 */
	
	String[] countries= {"USA","Japan", "China", "France"};
	String capital = null; 
	
	//switch case
	for (int i=0; i<countries.length; i++) {
		
		switch (countries[i]) {
		case "USA":
			capital="Washington DC"; 
			break; 
		case "Japan":
			capital="Tokyo"; 
			break; 	
		case "China":
			capital="Beijing"; 
			break; 	
		case "France":
			capital="Paris"; 
			break; 
		} 
	System.out.println("The capital of "+countries[i]+" is "+capital);
	}
	
	System.out.println( "***another way***");
	// enhance for loop 
	for (String country:countries) {
		if (country.equals("USA")) {
			capital="Washington DC";
		}else if (country.equals("Japan")) {
			capital="Tokyo"; 
		}else if (country.equals("China")) {
			capital="Beijing";
		}else if (country.equals("France")) {
			capital="Paris"; 
		}
		System.out.println("The capital of "+country+" is "+capital);
		
	}
	}
	}

