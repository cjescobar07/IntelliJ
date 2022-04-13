package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class WorkedYears {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		System.out.println("How many years have you worked for the company?");		
		int years=user.nextInt();			
			if (years>=5) {
				System.out.println("You qualify for the bonus");
			}else
				System.out.println("You do not qualify for the bonus");
		
				System.out.println("What is your annual salary?");
				String salary=user.next();
			if (salary.equals("50000")) {
			System.out.println("Your bonus is $5000");
		}else {
		System.out.println("Your bonus is $3000");
	}
	
		}
}
