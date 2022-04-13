package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String str = "Batch 12 is the greatest";
		
		System.out.println(str.replace("greatest","worst")); 
		System.out.println(str.replace("12", "!2"));
		System.out.println(str.replace(" ", "")); // "" ability to remove 
		
	}
}
