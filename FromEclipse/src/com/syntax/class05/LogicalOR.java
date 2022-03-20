package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		/* 
		 * OR = ||
		 * 
		 * TRUE || TRUE --> TRUE
		 * TRUE || FALSE --> TRUE
		 * FALSE || TRUE --> TRUE
		 * FALSE || FALSE --> FALSE
		 */
		
		String day="Monday";
		
		if (day.equals("Saturday") || day.equals("Sunday")){
			
			System.out.println("I have java class");			
		}
		System.out.println("Code outside of if statement");
		
		/*
		 * let's ask user what is today's date?
		 * 
		 * based on the day let's define which class we have
		 * if (monday or friday) --> there is no class today
		 * else if (tuesaday or wednesday) --> manual testing
		 * else if (thursday) --> review
		 * else if (saturday or sunday) --> java class		 * 
		 */
		
		Scanner user=new Scanner (System.in);
		System.out.println("What day is it today");
		String date=user.nextLine();
		
		if (date.equalsIgnoreCase("monday") || date.equalsIgnoreCase("Friday")){
				System.out.println("There is no class");		
		}else if (date.equalsIgnoreCase("Tuesday") || date.equalsIgnoreCase("Wednesday")) {
			System.out.println("There is manual testing class");
		}else if (date.equalsIgnoreCase("Saturday") || date.equals("Sunday")) {
			System.out.println("There is java programming class");
		}else if (date.equalsIgnoreCase("Thursday")){
			System.out.println("There is review class");
		}else {
			System.out.println("Invalid");
		}
		
		
		
	}
}

