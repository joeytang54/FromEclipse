package com.syntax.class12;

public class Phone {
	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Nokia with
	// specific attributes and behaviors.
	

	String name; 
	String brand;
	String color; 
	int price; 
	
	void makeCall() {
		System.out.println("Making a call");
	}
	void takePictures() {
		System.out.println("Taking pictures");
	}
	void printCompleteInfo() {
		System.out.println("name "+name);
		System.out.println("brand "+brand);
		System.out.println("color "+color);
		System.out.println("price "+price);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1=new Phone();
		phone1.name="iphone"; 
		phone1.brand="apple";
		phone1.color="space grey";
		phone1.price=1300; 
		phone1.makeCall();
		phone1.takePictures();
		phone1.printCompleteInfo();
		System.out.println("***********");
		
		Phone phone2=new Phone();
		phone2.name="Pixel"; 
		phone2.brand="google";
		phone2.color="black";
		phone2.price=800; 
		phone2.makeCall();
		phone2.takePictures();
		phone2.printCompleteInfo();
		System.out.println("***********");
		
		Phone phone3=new Phone();
		phone3.name="Nokia"; 
		phone3.brand="Nokia";
		phone3.color="black";
		phone3.price=400; 
		phone3.makeCall();
		phone3.takePictures();
		phone3.printCompleteInfo();
	}

}
