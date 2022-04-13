package com.syntax.class15_STRING_MANIPULATION;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String name = "How are @you guys @guys @guys @ guys";		
		System.out.println(name.indexOf("@"));
		System.out.println(name.indexOf("g"));
		
		System.out.println(name.indexOf("@", 8+1));
		System.out.println(name.indexOf("guys", 15+1));
		System.out.println(name.indexOf("@", name.indexOf(("@")+1)));
		
		
				

	
	}
}
