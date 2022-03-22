package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * initialization i=1
		 * condition 1<=5>true-> print 
		 * increment or decrement 
		 * repeat
		 */
		
		for (int i=1; i<=5; i++) {
			System.out.println("hello");
		}
System.out.println("I need to print number from 1-20");
/*
 * start point ->1
 * end point  ->20
 * increment or decrement 
 */
for (int j=1; j<=20; j++) {
	System.out.print(j+" ");
}

System.out.println("I need to print numbers from 10 to 25");

for (int i=10; i<=25; i++) {
	System.out.print(i+" ");
}
System.out.println("I need to print numbers from 50 to 1");
for (int k=50; k>=1; k--) {
	System.out.print(k+ " ");
}
		
	}

}
