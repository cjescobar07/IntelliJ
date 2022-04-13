package com.syntax.class05_LOGICAL_OPERATORS;

public class LogicalNOT {

	public static void main(String[] args) {
		
		//Logical NOT is used to revert the condition 
		
		boolean value=!false;		
		System.out.println(value);
		
		System.out.println("---------------------------");
		
		boolean traffic=false;		
		if (!traffic) {
			System.out.println("I will come on time to work");
		}
		
		System.out.println("---------------------------");
		
		String day="Saturday";
		if (!day.equals("Sunday")) {
			System.out.println("Today is not Saturday");
		}
		
		boolean checkboxChecked=false;
		
		if(!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}
		
		System.out.println("---------------------------");
		
		String java="easy";
		if(!java.equals("hard")) {
			System.out.println("You are a genius");
		}
		
		System.out.println("----------The End----------");
		
	}

}
