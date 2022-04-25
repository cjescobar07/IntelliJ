package com.syntax.class15_STRING_MANIPULATION;

public class Task4 {

	public static void main(String[] args) {
		
		//Create a String and print it in reverse order (Sunday → yadnuS).

		String str="Sunday";
		String reversedStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reversedStr=reversedStr+str.charAt(i);
		}
		System.out.println(reversedStr);
	}
}
