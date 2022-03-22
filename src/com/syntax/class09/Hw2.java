package com.syntax.class09;

public class Hw2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */
		String []animals= {"dog", "cat", "tiger", "horse", "bird"};
		for (String name:animals) {
			System.out.println(name);
		}
		System.out.println("------ Another way------");	
		
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
	}

}
