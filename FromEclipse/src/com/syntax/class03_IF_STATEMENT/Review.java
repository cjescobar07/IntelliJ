package com.syntax.class03_IF_STATEMENT;

//{} -----> block of code

public class Review {

	public static void main(String[] args) {
		
		String daytime="morning";
		int date=22;
		String month="January";
		
		//+ used to attach String to anything
		String sentence="Today is "+daytime+ " of "+month+" "+date;
	 
		System.out.println(sentence);
	
		int year=2022;
		String year1="2022";
	    
		System.out.println(year+10);//2032
		System.out.println(year1+10);//202210
	
		
		/*Casting
		 * What - is a process of converting the value from one type to another
		 * 
		 * 2 Type of Casting
		 * Widening / Implicit / Automatic 
		 * double d=10;
		 * byte -> short -> int -> long -> float -> double
		 * 
		 * Narrowing / Explicit / Manual
		 * double -> float -> long -> int -> short -> byte
		 * int i=10.399 -> error: cannot convert from double to int
		 * Why
		 * 
		 * Short Operators
		 * assignment= 
		 * arithmetical= , -, *, / , %
		 * relation and equality >, >=, <. <=, ==, !=
		 * Result of relational and equality operators is always boolean value (true, false)
		 * 
		 * -------------------------------------
		 * If Statement
		 * 
		 * Syntax OF IF STATEMENT
		 * If (boolean condition only) {
		 * 	code;
		 * }
		 * 
		 * -------------------------------------
		 * if (boolean condition){
		 * 	code;
		 * } else {
		 * 	code;
		 * }
		 * 
		 * -------------------------------------
		 * if (condition) {
		 * 
		 *     code A;
		 * }else if (condition2){
		 * 
		 *     code B;
		 * }else if (condition3){
		 * 
		 *     code C;
		 * 
		 */
		
	
	}
	
	
}
