package com.syntax.reviewclass05;

public class ForDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=0; x<5; x++) {
			System.out.println("Batch 12 is Best");
		}
		System.out.println("**** Next Sample***");
		
		
		int x=0; 
		for (System.out.println("1" +x);//this part will only ran 1 time (initialize) 
				x<5; System.out.println("3"+x)){
			System.out.println("Batch 12 is best");
			x++; 
		}
	}

}
