package com.syntax.class09;

public class TaskName {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 */
		
		String[ ]names=new String[5]; 
		names[0]="Joey"; 
		names[1]="Charles"; 
		names[2]="John"; 
		names[3]="Sarah";
		names[4]="Kelly"; 
		
		System.out.println(names[0]);
		
		String[] names2= {"Joey", "Charles","John","Sarah", "Kelly"};
		
		System.out.println(names2[0]);
		
	}

}
