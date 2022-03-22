package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		int num = 1;

		// create and array that holds 4 elements
		int[] numbers = new int[4];
		// storing values/element inside an array
		numbers[0] = 90;
		numbers[1] = 87;
		numbers[2] = 89;
		numbers[3] = 99;

		// print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3] + numbers[0]);// 189

		// I want to create and array of countries

		String[] countries = new String[5];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Afghanistan";
		countries[3] = "Moldova";
		countries[4] = "Morocco";
		//countries[5] = "Turkey"; ArrayIndexOutOfBoundsException 

		System.out.println(countries[3] + countries[4]);
		
		
		double[] prices= new double[4]; 
		prices[0]=5.99;
		prices[1]=4.49;
		prices[2]=8.99;
		prices[3]=7.29;
		
		double avg=(prices[0]+prices[1]+prices[2]+prices[3])/4;
		System.out.println(avg);
	}

}
