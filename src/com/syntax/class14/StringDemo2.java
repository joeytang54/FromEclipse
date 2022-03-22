package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="     Moreed        YOU        "; 
		System.out.println(name);
		System.out.println(name.trim());
		
		String name2="Run Moreed"; 
		System.out.println(name2.toLowerCase().startsWith("run"));//method changing 
		System.out.println(name2.startsWith("Moreed"));
		System.out.println(name2.endsWith("Moreed"));
	}

}
