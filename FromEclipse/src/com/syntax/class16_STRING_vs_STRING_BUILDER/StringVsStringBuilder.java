package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class StringVsStringBuilder {

	public static void main(String[] args) {

		String s = new String("Asghar Is Great"); //original string
		s.concat("hahah"); //add new String hahha to the original string
		System.out.println(s); //printing out the original string

		StringBuilder stringBuilder = new StringBuilder("Asghar Is Great");//original string
		stringBuilder.append("Hahha"); //add new String hahha to the string
		System.out.println(stringBuilder); //printing out the original string
		
				
		
		
		
	}
}

