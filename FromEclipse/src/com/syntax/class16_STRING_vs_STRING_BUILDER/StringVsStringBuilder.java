package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		
		String s = "Chris Is Great";
		
		System.out.println(s.replace(" ", ""));		
		System.out.println(s);
		s.concat("hahaha");
		
		StringBuilder stringBuilder = new StringBuilder("Chris Is Great");
		stringBuilder.append("hahaha");
		System.out.println(stringBuilder);
		
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder);
		
				
		
		
		
	}
}

