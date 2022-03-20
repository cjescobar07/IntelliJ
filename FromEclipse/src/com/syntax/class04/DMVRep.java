package com.syntax.class04;

import java.util.Scanner;

public class DMVRep {

	public static void main(String[] args) {
		
		/* You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		  * 
		  */
		
		Scanner customer=new Scanner(System.in);
			System.out.println("How old are you?");
			
			int age=customer.nextInt();
			
			if (age>=18) {
				System.out.println("You will be getting your Driver's License today!");
			}else {
				System.out.println("You will be getting a learner's permit today");
			}
		
		
		
		
		
	}
	
}
