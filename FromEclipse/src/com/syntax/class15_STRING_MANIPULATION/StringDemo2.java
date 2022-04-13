package com.syntax.class15_STRING_MANIPULATION;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name = "Where are you guys @";
		System.out.println(name.charAt(2));
		
		for (int i = 0; i<name.length(); i++) {
			System.out.print("_" + name.charAt(i));
			
		}
		
	}
}
