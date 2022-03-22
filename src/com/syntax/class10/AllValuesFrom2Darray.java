package com.syntax.class10;

public class AllValuesFrom2Darray {

	public static void main(String[] args) {
		int[][] numbers = { { 10, 20, 30}, // 0
				{ 100, 200, 300, 400 }, // 1
				{ 1000, 2000 }// 2
		};
		

		//retrieving all elements from 2D Array
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		int size=numbers.length; // numbers.length -> number of rows 
		System.out.println(size);//3
		
		int sizeof1Array=numbers[0].length; 
		System.out.println("Size of First array =" +sizeof1Array);//4
		
		int sizeof2Array=numbers[1].length;
		System.out.println("Size of Second array =" +sizeof2Array);
		
		int sizeof3Array=numbers[2].length;
		System.out.println("Size of Third array =" +sizeof3Array);
	}

}
