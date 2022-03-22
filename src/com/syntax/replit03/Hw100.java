package com.syntax.replit03;

import java.util.Scanner;

public class Hw100 {
	
	
	String reverseString(String s)  {
		StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
		 * 
		 * String s; String s; Write a for loop that will print out the reverse of the
		 * string.
		 * 
		 * Sample input/outputs:
		 * 
		 *In: manhattan nattahnam 
		 *In: processor rossecorp 
		 *In: racecar racecar
		 */
		
			    Scanner inp = new Scanner(System.in);
			    System.out.print("In:");
			    String s = inp.nextLine();
			    
			    Hw100 hw=new Hw100(); 
			    
			    
			    System.out.println(hw.reverseString(s));
			    
			    
			    
	}

}
