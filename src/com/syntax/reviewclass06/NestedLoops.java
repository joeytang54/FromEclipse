package com.syntax.reviewclass06;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			for (int j=1; j<3; j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println(" **** Muliplaction table****");
		for (int a=1; a<10; a++){
			for (int b=1; b<10; b++) {
				System.out.println(a+" x "+b+ " = "+a*b);
			}
			System.out.println("-------------");
		}
	}

}
