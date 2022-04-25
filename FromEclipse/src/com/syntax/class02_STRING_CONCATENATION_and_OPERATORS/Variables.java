package com.syntax.class02_STRING_CONCATENATION_and_OPERATORS;

public class Variables {

	public static void main(String[] args) {
		
		String firstname="Christian";
		String secondname="Escobar";
		String letter="A";
		String city="Woodbridge";
		String state="Virginia";
		long num1=63156132521151l;
		String mobile="703-556-2469";
		
		System.out.println("My name is "+firstname+" and my last name is "+secondname+". ");
		System.out.println("I am "+letter+" student. ");
		System.out.println("I live in "+city+", "+state+".");
		System.out.println("And my phone number is "+mobile+".");
		
		city="Winchester";
		state="Virginia";
		mobile="571-652-7846";
		
		System.out.println("My name is "+firstname+" and I moved to "+city+", "+state+". "+"My new number is "+mobile+".");
		
		
			
	}
	
}