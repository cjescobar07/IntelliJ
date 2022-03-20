package com.syntax.class04;

import java.util.Scanner;

public class NestedIFStatement {

	public static void main(String[] args) {
		
		/*
		 * Nested IF - IF inside another IF.
		 * if (boolean condition) {          // Outer IF
		 * 	code A;
		 * 
		 * if (boolean condition) {         // Nested IF
		 * 	code B;
		 * }
		 * 
		 * Nested IF has a dependency of Outer IF
		 * 
		 */
		Scanner user=new Scanner (System.in);
		
		boolean vaccine=true;		
		int dose=2;
		
		if (vaccine) {
			
			System.out.println("How many doses you have?");
			
			if (dose==1) {
				System.out.println("You need another shot");
				
			}else {
				System.out.println("You are fully vaccinated");
			}
			
		}
			
			System.out.println("-----------------");
		/*
		 * Declare a variable for allergies
		 * 
		 * if you have allergies--->
		 * 							if you have pollen
		 * 							if you have peanut
		 * 							if you have wheat
		 * if no, allergies ---> you are lucky
		 */
		
			
			boolean allergy=true;
			
			if (allergy) {         //Outer IF
				System.out.println("Let's check what allergies you have");
				String allergyType="pollen";
				
				//Nested IF --> always has a dependency on Outer IF
				//Outer IF MUST be true in order for Nested IF to be checked
				if (allergyType.equals("pollen")) {
					System.out.println("Please stay at home when tress are blooming.Take medication");
				}else if(allergyType==("peanuts")) {
					System.out.println("Please do not eat peanuts.");
				}else if (allergyType.equals("glutten")) {
					System.out.println("Please follow glutten free diet");
				}else {
					System.out.println("I don't know which suggestion to give anymore");
				}
			}else {
				System.out.println("You are lucky");
			}
			}
			             
					

}
