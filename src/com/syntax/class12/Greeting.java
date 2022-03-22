package com.syntax.class12;

public class Greeting {
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	void sayHelloManyTimes(String name) {
		for (int x=0; x<5; x++) {
			System.out.println("Hello "+name);
		}
	}
void sayHelloNumberOfTimes(String name, int times) {
	for (int i=0; i<times; i++) {
		System.out.println("Hello "+name);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeter= new Greeting(); 
		greeter.sayHelloNumberOfTimes("Tarik", 10);
		
		

	}

}
