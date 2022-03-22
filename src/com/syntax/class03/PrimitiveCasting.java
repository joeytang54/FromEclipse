package com.syntax.class03;

public class PrimitiveCasting {
	
	//main+ctr+space
	// ctr+space >autocomplete 
	
	public static void main(String[] args) {
		
		int i=10; 
		
		// widening or implicit
		//we store int value 10 inside double variable
		double d=10; 
		
		System.out.println(i);//10
		System.out.println(d);//10.0
		
		//int num=10.0; //Type mismatch: cannot convert from double to int
		
		//narrowing or explicit casting 
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f; 
		//type mismatch:cannot convert from double to float (all decimals # treated as double in Java) 
 
		byte b=(byte) 1000; 
		System.out.println(b);
		
		long number=7979799999999l;
		System.out.println(number);
		
		int number2=(int)7979799999999l; 
		System.out.println(number2);
	}

}
