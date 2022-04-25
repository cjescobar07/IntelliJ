package com.syntax.class15_STRING_MANIPULATION;

public class StringDemo2 {

	public static void main(String[] args) {
		String name="How Are you guys @";
		//System.out.println(name.charAt(3));

		//write a loop to print all the characters of a String
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+ "_");
		}

	}
}
