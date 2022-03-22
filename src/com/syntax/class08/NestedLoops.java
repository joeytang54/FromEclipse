package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			System.out.println("I am i loop " +i);
			
			for (int j=1; j<=2; j++) {
				System.out.println("I am nested j loop "+j);
				
				}
				}
				
		System.out.println("----------------------");
		for (int l=1; l<=3; l++) {
			System.out.println(l);
			for (int k=1; k>=4; k++) {
				System.out.println(k);
				
			}	
				}
				
				System.out.println("**** CAR MILEAGE*****");
				for (int a=0; a<=9; a++) {
					for (int b=0; b<=9; b++) {
						for (int c=0; c<=9; c++) {
							System.out.println(a+" "+b+ " "+c);
			
		}
			}
		}
				System.out.println("*** Clock***");
				for (int h=0; h<=23; h++) {
					for (int m1=0; m1<=5; m1++) {
						for (int m2=0; m2<=9; m2++) {
							System.out.println(h+":"+m1+m2);
						}
						}
					}
				
				System.out.println("*** Clock 2***");
				String time; 
				for (int h=0; h<24; h++) {
					for (int m=0; m<=59; m++) {
						if (h<10 && m<10) {
							time="0"+h+":"+"0"+m; 
							System.out.println(time);
						}else if (h<10 && m>=10) {
							time="0"+h+":"+m; 
						}else if (h>=10 && m<10) {
							time =h+":"+"0"+m; 
							System.out.println(time);
							}else {
								time =h+":"+m; 
								System.out.println(time);
							}
				}
				}

	}
}


