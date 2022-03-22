package com.syntax.class10;

public class TwoDArrayTask2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names
		 * and second array will contain grades. Then your program should print name of
		 * the students that has A and B grade
		 */
		
		String [][] nameGrades= {
				{"John", "Sam", "Kelly", "Sarah"}, 
				{"A", "B", "C","B"}
		};
		System.out.println(nameGrades[0][0]);
		System.out.println(nameGrades [0][1]);
		System.out.println(nameGrades[0][3]);
	}

}
