package com.syntax.class01_INTRO_and_DATATYPES;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		// 1 create a variable=box=container
		
		/*
		 * to create a varible we need:
		 * 			1. Specify dataType
		 * 			2. Give a name
		 */
		
		//dataTypes to represent numeric values
		
		byte box1=127;
		short box2=32767;
		int box3=2147483647; //most used; integer
		long box4=6512386994654656260l; //will be using, need L/l at the end of number
				
		//dataTypes to represent decimals
		
		float price=12.99F; //float always needs F/f at the end of decimal
		double price1=13.99; //most used
		
		//to represent a single character
		
		char gender='F';
		char sign='$';
		
		//to represent true or false		
		boolean snow=false;
		boolean tired=true;
		
		//I want to print 13.99?
		System.out.println(price);
		
		System.out.println(price1);
		
		System.out.println(sign);
		
		System.out.println(gender);
		
		System.out.println(snow);
		
		System.out.println(tired);
		
		System.out.println(price);
		
		System.out.println(box1);
		
		System.out.println(box2);
		
		System.out.println(box3);
		
		System.out.println(box4);
	
		
	}

}
