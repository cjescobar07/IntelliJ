package com.syntax.class16;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str = "123456!#$#%#&asdnkaASGJSXU";
		String str2 = str.toLowerCase();
		
		System.out.println(str.replaceAll("[0-9]", "Chris"));
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", ""));
		System.out.println(str.replaceAll("[A-Z]", ""));
		System.out.println(str.replaceAll("[!-/]", ""));
		System.out.println(str.replaceAll("[A-z]", ""));
		System.out.println(str.replaceAll("[!@#$%^&*]", ""));
		System.out.println(str.replaceAll("[A-Za-z0-9]", ""));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "")); // ^ is identified as not
		
		String given = "Hello Syntax friends";
		  System.out.println(given.replace("Welcome Syntax family", given));
		
	}
}
