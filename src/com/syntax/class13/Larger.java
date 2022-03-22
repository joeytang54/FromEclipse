package com.syntax.class13;

public class Larger {
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	void Larger(int num1,int num2) {
		if (num1>num2) {
			System.out.println("Number 1 is greater");
		}else if (num2>num1){
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("Numbers are the same");
		}
	}
	
	
	public static void main(String[] args) {
		Larger object=new Larger(); 
		object.Larger(10, 12); 
		object.Larger(13, 42); 
		object.Larger(50, 50); 
	}

}
