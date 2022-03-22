package com.syntax.reviewclass02;

public class ShortHandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(++num);// 10 increment +1
		System.out.println(num++);//
		System.out.println(num);

		int num1 = 10;
		System.out.println(++num1+ num1++);
		//(++num1)=11 +11 =22, for ++ the updated value will be increment next line
		System.out.println(num1);// 12
	}

}
