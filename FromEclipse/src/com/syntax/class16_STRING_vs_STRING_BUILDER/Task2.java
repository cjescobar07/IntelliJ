package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class Task2 {

	public static void main(String[] args) {
		
		// Create a String that should be combination of letters, numbers and special characters. 
		// Find out how many Alphanumeric characters are there in the String.

		String str = "1234!@#$%esdfAZSX123";
		System.out.println(str.length());
		System.out.println(str.replaceAll("[^A-Za-z0-9@#]", "").length());
		
		System.out.println(str.replaceAll("[^A-Za-z0-9@#]", ""));
		
		
		
		
		
		
		
	}
}
