package com.syntax.class03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
				
		//main+ctrl+space
		//ctrl=space ----> auto-completes
		
		
		int  i=10;
		
		//Widening or implicit
		//We store int value 10 inside double variable
		double d=10;
		
		System.out.println(i);
		System.out.println(d);
		
		//Narrowing or explicit casting
		//We store double value 10.99 into int variable
		int num=(int)10.99;		
		System.out.println(num);
		
		float f=10.99f; //Type mismatch: cannot convert from double to float
		
		byte b=(byte)1000;
		System.out.println(b);
		
		//Example of Narrowing
		int number=(int)6486161566526224699l;
		System.out.println(number);
		
		
	}
	
}
	

