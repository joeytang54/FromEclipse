package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		//+, -, *, /, %
		
		int num=100; 
		num=num+100; //reassigning value 
		System.out.println(num); //200
		
		num+=100; //this exact means >this num=num+100
				
		System.out.println(num);//300
		
		num-=20; //300-20
		System.out.println(num);//280
		
		num/=10; //280/10
		System.out.println(num);//28
		
		num%=2;  //28%2
		System.out.println(num);//0
		
	}

}
