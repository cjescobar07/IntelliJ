package com.syntax.class14_STRING_METHODS;

public class StingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "        C h r i s         ";
		System.out.println(name); 
		System.out.println(name.trim());
		
		String name2 = "Run Chris"; 
		System.out.println(name2.startsWith("Run"));
		System.out.println(name2.toLowerCase().startsWith("run")); // method chaining
		System.out.println(name2.startsWith("Chris"));
		System.out.println(name2.endsWith("Chris"));
		System.out.println(name2.endsWith("s"));
		System.out.println(name2.contains("s"));
		System.out.println(name2.toLowerCase().contains("s"));
		
	}
}
