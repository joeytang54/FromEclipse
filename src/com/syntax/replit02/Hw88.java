package com.syntax.replit02;

public class Hw88 {

	
		/*
		 * In this class, you should specify the following attributes: breed, name,
		 * color, and following behaviors: bark(), run(), play().
		 * 
		 * Create 3 different objects of it: Husky, Bulldog, Labrador with specific
		 * attributes and behaviors.
		 * 
		 */
		String breed; 
		String name; 
		String color; 
		void bark() {
			System.out.println( breed+" can bark");
		}
		void run() {
			System.out.println( breed+ " can run");
		}
		void play() {
			System.out.println( breed+ " can play");
		}
		void printCompleteInfo() {
			
			
			
		}
		
		public static void main(String[] args) {
		
			Hw88 husky=new Hw88(); 
			husky.breed="Husky";
			husky.bark(); 
			husky.run(); 
			husky.play(); 
			husky.printCompleteInfo(); 
			
			
			Hw88 bulldog=new Hw88(); 
			bulldog.breed="Bulldog";
			bulldog.bark(); 
			bulldog.run(); 
			bulldog.play(); 
			bulldog.printCompleteInfo(); 
			
			
			Hw88 lab=new Hw88(); 
			lab.breed="Labrador";
			lab.bark(); 
			lab.run(); 
			lab.play(); 
			lab.printCompleteInfo(); 
			
			
	}

}
