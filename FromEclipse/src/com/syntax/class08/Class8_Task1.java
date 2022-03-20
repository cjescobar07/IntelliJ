package com.syntax.class08;

import java.util.Scanner;

public class Class8_Task1 {

	public static void main(String[] args) {

		/*
		 *1. Print numbers from 1 to 50 except those that are divisible by 3
		 *2. Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.
		 */

		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i+" ");
		}
		System.out.println("------------------------");
		System.out.println();
		
		Scanner user=new Scanner (System.in);		
		String answer;
		
		do {
			System.out.println("Would you like to apply for a credit card?");
			answer=user.nextLine();
			}while (!answer.equalsIgnoreCase("yes")); {
				System.out.println("Congrats on your new cc!");
			}
			
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
