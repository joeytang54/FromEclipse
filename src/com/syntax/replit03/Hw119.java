package com.syntax.replit03;

public class Hw119 {
	void censorLetter(String str, char a) {
		String b=str.replace(a, '*'); 
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		/*
		 * Write a method header with the following specs:
		 * 
		 * Returns: a String 
		 * Name:censorLetter
		 * Parameters:
		 * 
		 * a String a char 
         * Then complete the method by programming the
		 * following behavior
		 * 
		 * Replace all instances of given character with a "*" within the given String.
		 * See below examples. Replace all instances of given character with a "*"
		 * within the given String. See below examples. Examples:
		 * 
		 * censorLetter("computer science",'e') ==> "comput*r sci*nc*"
		 * censorLetter("trick or treat",'t') ==> "*rick or *rea*"
		 */
Hw119 obj=new Hw119(); 
obj.censorLetter("computer science", 'e'); 
obj.censorLetter("trick or treat" , 't'); 
	}

}
