package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2); //false
		System.out.println(num1==num2); //false
		System.out.println(num1<num2); //true
		
		boolean result=num1==num2;
		System.out.println("Result is "+result); //false
		
		
		System.out.println(num1=num2); //16, reassigning
		System.out.println(num1); //16
		System.out.println(num1==num2); //true, == means comparing two numbers
		System.out.println(num1!=num2); //false, ! means not equal
		
		
		
		
		
	}
	
	
	

}
