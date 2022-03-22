package com.syntax.replit03;

public class Hw110 {
	void newLine() {
		System.out.println("newLine method implementation");
	}
	void displayLine() {
		System.out.println("displayLine method implementation");
	}

	public static void main(String[] args) {
		/*
		 * Create a method name as newLine that should have print statement inside the
		 * method body as "newLine method implementation"
		 * 
		 * Create a method name as displayLine that should have print statement inside
		 * the method body as "displayLine method implementation"
		 * 
		 * Call both methods
		 * 
		 * Expected Output:
		 * 
		 * newLine method implementation 
		 * displayLine method implementation
		 */
		Hw110 obj=new Hw110();
		obj.newLine();
		obj.displayLine(); 
		
		
	}

}
