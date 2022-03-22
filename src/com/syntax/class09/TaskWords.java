package com.syntax.class09;

public class TaskWords {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then prCreate an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”. 
		 */
String[] words=new String[5];
words[0]="Java"; 
words[1]="Saturday"; 
words[2]="day"; 
words[3]="coding"; 
words[4]="is"; 

System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

String [] words2= {"Java", "Saturday","day","coding", "is"};

System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}
