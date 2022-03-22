package com.syntax.class14;
/*
 * Accept username, password and confirm password from a user and check
 * following requirements: Username and Password cannot be empty, if so→
 * message=”Username and Password cannot be empty”. Password should be minimum 8
 * characters, if less → message=”Password is too short”. Password cannot
 * contain username if so, → message=”Password cannot contain username”.
 * Password should match confirmed password, if not → message=“Passwords do not
 * match”. Only after all requirements met → message “Your username and password
 * has been created”
 */

public class UsernamePasswordHw {
	
	String userPasswordCheck(String username, String password, String confirm) {
		if (username.isEmpty()||password.isEmpty()) {
			return ("Username and Password cannot be empty");	
		}else if (password.length()<8) {
			return ("Password is too short");
		}else if (password.equals(username)) {
			return ("Password cannot contain username");
		}else if (password!=confirm) {
			return ("Password do not match");
		}else {
			return ("Your username and password has been created");
		}
	}

	public static void main(String[] args) {
		
		UsernamePasswordHw obj=new UsernamePasswordHw(); 
		
		System.out.println(obj.userPasswordCheck("joeytang", "", ""));
		System.out.println(obj.userPasswordCheck("joeytang", "A123456", "A123456"));
		System.out.println(obj.userPasswordCheck("joeytang", "joeytang", "joeytang"));
		System.out.println(obj.userPasswordCheck("joeytang", "A1234567", "A7654321"));
		System.out.println(obj.userPasswordCheck("joeytang", "A1234567", "A1234567"));
		
		
	}
}
