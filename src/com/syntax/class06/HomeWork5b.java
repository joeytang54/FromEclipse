package com.syntax.class06;

import java.util.Scanner;

public class HomeWork5b {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("Input quiz score");
		int quiz=scan.nextInt(); 
		System.out.println("Input mid-term score");
		int midTerm=scan.nextInt(); 
		System.out.println("Input finals score");
		int finals=scan.nextInt(); 
		
	int score=(quiz+midTerm+finals)/3;
	char grade; 
			
		
		if (grade >=90) {
			System.out.println("Grade A");
		}else if ((quiz+midTerm+finals)/3 >=70) {
			System.out.println("Grade B");
		}else if ((quiz+midTerm+finals)/3 >=50 && (quiz+midTerm+finals)/3 <70){
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}
	}

}
