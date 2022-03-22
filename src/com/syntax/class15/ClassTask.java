package com.syntax.class15;

public class ClassTask {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: 
		 * Example Output: 
		 * Mom’s first name? Mary 
		 * Dad’s first name? Daniel 
		 * Boy or Girl? boy 
		 * Suggested baby name: DANRY 
		 * Example Output: Mom’s first name? Mary 
		 * Dad’s first name? Daniel
		 * Boy or Girl? girl 
		 * Suggested baby name: MAIEL
		 */
		
		public static void main(String[] args) {
			
			String momName="Sally"; 
			String dadName="Daniel"; 
			boolean boy=false; 
			String firstPart="";
			String secondPart="";
			
			if (boy) {
				firstPart=dadName.substring(0, dadName.length()/2); 
				secondPart=momName.substring(momName.length()/2); 	
			}else if (!boy) {
				firstPart=momName.substring(0, momName.length()/2); 
				secondPart=dadName.substring(dadName.length()/2); 	
			}
			
			System.out.println(firstPart+secondPart);
	}

}
