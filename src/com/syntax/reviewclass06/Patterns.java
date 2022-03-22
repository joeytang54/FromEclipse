package com.syntax.reviewclass06;

public class Patterns {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.println("*");
		}
		System.out.println();
		
		System.out.println("better way");
		
		for (int r=1;r<=4; r++) {
			for (int col=1; col<=5; col++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("********");
		
		for (int a=5; a>0; a--) {
			for (int b=1; b<=5; b++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("**********");
		
		for (int c=1; c<=4; c++) {
			for (int d=1; d<=5; d++) {
				if (c==1||c==4 || d==1|| d==5){
					System.out.print("*");
				}else {
					System.out.print(" ");
			}
			}
			System.out.println(" ");
		}
		System.out.println("***********");
		
		for (int x=1; x<=5; x++) {
			for (int y=1; y<=x; y++) {
				System.out.print(x);
			}
			System.out.println(" ");
			
		}
	}

	}
