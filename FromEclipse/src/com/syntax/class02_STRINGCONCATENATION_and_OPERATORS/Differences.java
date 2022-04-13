package com.syntax.class02_STRINGCONCATENATION_and_OPERATORS;

public class Differences {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Bye";
		
		String e="Yes";
		String f="No";
		
		
		int c=10;
		int d=20;
		int sum=c+d;
		
		int g=30;
		int h=40;
		
		System.out.println(c+d+a+b);//30HelloBye
		
		System.out.println(a+b+c+d);//HelloBye1020
		
		System.out.println(a+b+(c+d));//HelloBye30
		
		System.out.println(a+f+(g+d));
		
		int num=123;
		String num2="123";
		
		String what=num+num2;
		System.out.println(what);//123123
		
		System.out.println(num+num2);//123123
				
		

	}

}
