package com.syntax.class09;

public class TaskGrades {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
char [] grades= new char[6]; 
grades[0]='A';
grades[1]='B';
grades[2]='C';
grades[3]='D';
grades[4]='E';
grades[5]='F';
System.out.println(grades[1]);

char[] grades2= {'A','B','C','D','E','F'}; 

// how many elements inside array?
int size=grades2.length;
System.out.println("Numbers of elements is ="+size);

/*
 * System.out.println(grades2[1]);
 * System.out.println(grades2[2]);
 * System.out.println(grades2[3]);
 */



for (int i=0; i<grades2.length; i++) {
	System.out.println(grades2[i]);
}

String[]cities= {"Washington DC", "Miami", "Los Angles", "New York"}; 
for (int a=0; a<cities.length; a++) {
	System.out.println(cities[a]+" ");
	
	if(cities[a].equals("Miami")){
	System.out.println("I want to live in Miami");
}
}
}

	}


