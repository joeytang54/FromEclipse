package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		String name ="How @you @guys Camel"; 
		System.out.println(name.indexOf("@"));//index location (4)
		System.out.println(name.indexOf("Horse"));//show -1 coz not found
		System.out.println(name.indexOf("@", 8+1));//jump to next @ (index # 9)
		System.out.println(name.indexOf("@", name.indexOf("@")+1));//jump to the 2nd @(index # 9)
		

	}

}
