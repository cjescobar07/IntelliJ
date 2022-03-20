package com.syntax.class04;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Write a program to check whether number is positive or negative.
		 */

		int num=0;
		
		if (num<0) {
			System.out.println("The numnber "+num+" is Negative");
			
		}else if (num>0) {
			System.out.println("The number "+num+" is Positive");
			
		}else {
			System.out.println("The number is "+num);
		}
		
		/*
		 * Write a java program to check whether number is Even or odd.
		 */
		
		num=10;
		
		if (num % 2 == 0) {
			System.out.println("This "+num+" is an Even Number");
		}else {
			System.out.println("This "+num+" is an Odd Number");
		}
		
	}

}
