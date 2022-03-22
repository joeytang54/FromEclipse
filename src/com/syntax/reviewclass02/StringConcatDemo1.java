package com.syntax.reviewclass02;

public class StringConcatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "10";
		int number1 = 10;
		char letter1 = 'A';
		System.out.println(letter1+number1+name);//A=65+num1=10, +name=10
		System.out.println(letter1+name+number1);//A1010
		System.out.println(10+10+"10");
		System.out.println(10+10+"10"+10+10);
		System.out.println(10+10+"10"+(10+10));
	}

}
