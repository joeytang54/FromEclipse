package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean vaccine=true; 
		int dose=2; 
		
		if (vaccine) {
			System.out.println("How many doses you have?");
		if (dose==1){
			System.out.println("You need another shot");
			
			}else{
				System.out.println("You are fully vaccinated");
			}
		}
		
	System.out.println("-----------------------------");
	
	/*
	 * declare a variable for allergy
	 * 
	 * if you have allergy -->
	 *                     pollen
	 *                     peanut
	 *                     wheat
	 * if no allergy --> you are lucky
	 */
	
	
	boolean allergy=true; 
	
	
	if (allergy) {//outer if
		System.out.println("Let's check what allergies you have");
		String allergyType="pollen"; 
		
		//nested if> always has a dependency on outer if. 
		//outer if MUST be true in order for nested if to be checked
		if (allergyType.equals("pollen")) {
			System.out.println("Please stay home when trees are blooming. Take medication A");
		}else if (allergyType.equals("peanut")) {
			System.out.println("Please do not eat food that contains nuts. Take medication B");
		}else if (allergyType.equals("wheat")){
			System.out.println("Please follow gluten free diet. Take medication C");
		}else {
			System.out.println("I dont know which suggestion to give you");
		}
		
	}else {
		System.out.println("You are lucky");
	}
	
	
	
	}
}


