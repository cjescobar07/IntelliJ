package com.syntax.class16;

public class Recap {

	public static void main(String[] args) {
		
		String str = "Chris E";
		String str2 = "This is my #4569871234 Chris";
				
		System.out.println(str.charAt(0)); // (0) returns the first index of a word
		System.out.println(str.charAt(3)); // (3) returns the specified index of a word
		System.out.println(str.length()); // str.length() returns the number count of characters
		System.out.println(str.charAt(str.length()-1)); // returns the last index of a word
		System.out.println("-------------------------");
		System.out.println(str.indexOf("R")); // because Java is case sensitive, it will return as -1
		System.out.println(str.indexOf("r")); // 
		System.out.println(str.lastIndexOf("E"));
		System.out.println("-------------------------");
		System.out.println(str2.indexOf("#"));
		System.out.println(str2.substring(str2.indexOf("#")+1));
		System.out.println(str2.substring(12, 23));
		System.out.println(str2.substring(str2.indexOf("#")+1,str2.indexOf("#")+1+11));
		
	}
}
