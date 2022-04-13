package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class Task6 {

	public static void main(String[] args) {
		
		// How would you swap 2 strings without a temporary variable?

		String a = "one";
		String b = "two";
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("-----------");
		a = a + b; 
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		
		
		
		
	}
}
