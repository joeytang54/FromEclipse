package com.syntax.class03;

public class MoreExapmles {

	public static void main(String[] args) {
	/*
	 * we need to declare a boolean variable hungry: yes/no
	 * if we are hungry > I am going to eat
	 * otherwise >I am going to drink tea
	 * 
	 */
	
	boolean hungry=false; 
	
	if (hungry==true) {
		System.out.println("I am going to eat.");
	}else {
		System.out.println("I am going to drink a tea.");
	}

	boolean traffic=true; 
	if (traffic) {
		System.out.println("I am coming home late.");
	}else {
		System.out.println("No traffic, I am on time");
	}
	
	
	/* define a variable to store a browser 
	 * If browser is Chrome > we are executing tests on Chrome
	 * otherwise > I am not executing any test cases
	 */
	
	String browser="chrome"; //always use .equals to compare 2 strings
	// if (browser) {}// Type mismatch: cannot convert from string to boolean
	
	if (browser.equals("chrome")) {
		System.out.println("We are executing tests on Chrome");
	}else {
		System.out.println("I am not excuting any test cases");
	}
	
	//this would work in this example but not preferable 
	if (browser==("chrome")) {
		System.out.println("We are executing tests on Chrome");
	}else {
		System.out.println("I am not excuting any test cases");
	}
	
	
	}

}
