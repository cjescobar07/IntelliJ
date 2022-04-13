package com.syntax.class03_IF_STATEMENT;

public class MorePractice {

	public static void main(String[] args) {
	/*
	 * define a variable to store a value of day
	 * 
	 * if day is Saturday --> I am having Java Class today
	 * otherwise --> I am playing video games
	 */

		String day="Monday";
		if (day.equals("Saturday")) {
			System.out.println("I am having Java Class today");
			System.out.println("I am very excited");
			System.out.println("I am going to have fun with my classmates");
		}else {
			System.out.println("I don't know what class I have");
			System.out.println("Maybe today is fun day");
		}
		
	}

}
