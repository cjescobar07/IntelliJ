package com.syntax.class05;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
	//Class 5
	/*
	 * if (boolean condition){
	 * 
	 * 	if (boolean condition) {
	 *  }
	 * }
	 * 
	 * TO CAPUTE A CHAR IN SCANNER
	 * 
	 * System.println("Please enter a char value")
	 * char character=input.next().charAt(0);
	 * 
	 * 
	 * String value=scan.next(); //nextInt(); nextDouble(); nextBoolean(); next().charAt(0);
	 * 
	 * else == to otherwise
	 * else if == to what if
	 */
		
//----------------------------------------------------		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Capturing value using next");
		String value=scan.next();
		System.out.println(value);
		
		scan.nextLine();	
		System.out.println("Capturing values using nextLine");
		
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of program");
	}
	

}
