package com.syntax.class06;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("Enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("Input operator: +, -, *, /, %");
		char operator = scan.next().charAt(0);
		int answer = 0; 
		switch (operator) {
		
		
		
		case '+':
			answer =(num1+num2); 
			break; 
			
		case '-':
			answer =(num1-num2); 
			break; 
		case '*':
			answer=(num1*num2);
			break; 
		case'/':
			if (num2!=0) {
			answer=(num1/num2);
			}else { System.out.println("We cannot devide a number by "+num2);
			}
			break; 
		case'%':
			answer=(num1%num2); 
			break; 
			default:
				System.out.println("Invalid operator");

			
		}
			System.out.println(answer);
		}
		

	}


