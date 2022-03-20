package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
	
		String name = "Chris"; //best practice to use this way
		
		String name2 = new String("Chris in all uppercase"); // Still possible but not preferred
	
		System.out.println(name);
		System.out.println(name2.length());	
		
		System.out.println(name.length());
		String newName = name2.toLowerCase();
		System.out.println(name2.toLowerCase());
		System.out.println(name2.toUpperCase());
		
		//name = null;
		//System.out.println(name + name2); //always prefer this method to perform concatenation.
		System.out.println(name.concat(name2));
		name = "                 ";
		System.out.println(name.isEmpty());
		//System.out.println(name.isBlank());

		
		
		
		
		
		
  }
}
