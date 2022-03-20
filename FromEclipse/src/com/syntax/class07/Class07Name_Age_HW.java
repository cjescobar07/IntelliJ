package com.syntax.class07;

import java.util.Scanner;

public class Class07Name_Age_HW {

	public static void main(String[] args) {
		
		/*
		 * Ask a user to enter name, last name and age 5 times. 
		 * Every time your program should print those values in a format 
		 * “You name is _ _ and you are _ years old’
		 */
		
		Scanner user=new Scanner (System.in);
		
		for (int i=1; i<=5; i++) {
		System.out.println("Please enter your name");
		String name=user.nextLine();
		
		System.out.println("Please enter your last name");
		String lname=user.nextLine();
		
		System.out.println("Please enter your age");
		int age=user.nextInt();
		
		System.out.println("Your name is "+name+" "+lname+ " and you are "+age+ " years old.");
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
