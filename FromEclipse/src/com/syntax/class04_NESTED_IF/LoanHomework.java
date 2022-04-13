package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class LoanHomework {

	public static void main(String[] args) {
		
		/* You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money 
		 * otherwise you would reject the client.
		 */
		Scanner user=new Scanner(System.in);
		System.out.println("How much is your asking loan?");
		
		int loan=user.nextInt();
		if (loan<=200000) {
			System.out.println("We can provide with you a loan of "+loan);
		}else {
			System.out.println("Sorry we cannot approve you for the "+loan+" you reuquested at this time");
		}
	}
	
}
