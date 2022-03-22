package com.syntax.class05;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =“Spring” if user is born in June, July, August → season =“Summer” etc …
		 */

		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter your birth month");
		String month=scan.next(); 
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") ) {
			System.out.println("Spring");
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") ) {
			System.out.println("Summer");
		}else if (month.equalsIgnoreCase("Sempember") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") ) {
			System.out.println("Fall");
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Januray") || month.equalsIgnoreCase("February") ) {
			System.out.println("Winter");
		}else {
			System.out.println("invalid input");
		}
		
	}

}
