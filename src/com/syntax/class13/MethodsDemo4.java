package com.syntax.class13;

public class MethodsDemo4 {
	
	//create a method that takes a boolean isSaleOn price double discount
	// if isSaleOn=return discount price other wise original price
	
	double isSaleOn(boolean onSale, double price, double discount) {
		if (onSale) {
			return (price-price*discount); 
		}else{
			return price; 
		}
	}
	
	

	public static void main(String[] args) {
		
		MethodsDemo4 obj=new MethodsDemo4(); 
		System.out.println(obj.isSaleOn(true, 100, .15));
		System.out.println(obj.isSaleOn(false, 100, .15));
	}

}
