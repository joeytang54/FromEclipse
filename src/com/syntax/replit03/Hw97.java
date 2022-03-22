package com.syntax.replit03;

import java.util.Scanner;

public class Hw97 {
	String whichBrowser(String browser){
		if (browser.equalsIgnoreCase("Chrome")) {
			return ("Proceed with Chrome browser");
		}else if (browser.equalsIgnoreCase("firefox")) {
			return ("Proceed with Firefox browser");
		}else if (browser.equalsIgnoreCase("IE")) {
			return ("Proceed with IE browser");
		}else {
			return ("Invalid browser"); 
		}
	}
	public static void main(String[] args) {
		/*
		 * Based on the user inputs program should give a correct answer.
		 * 
		 * If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
		 * 
		 * "Proceed with Chrome browser"
		 * 
		 * If browser is firefox, FIREFOX or FireFOX it should print the:
		 * 
		 * "Proceed with Firefox browser"
		 * 
		 * If browser is IE, ie or iE it should print the:
		 * 
		 * "Proceed with IE browser"
		 * 
		 * If any other browser it should print the:
		 * 
		 * "Invalid browser"
		 */
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    
	    Hw97 obj=new Hw97(); 
	    
	    System.out.println(obj.whichBrowser(browser));
	    
	}

}
