package com.syntax.class04;

import java.util.Scanner;

public class WorkedYears2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
			System.out.println("How many years have you worked for the company?");
			
			int years=user.nextInt();
			if (years>=5) {
				System.out.println("You are eligible for the bonus");
			}else 
			System.out.println("Sorry, you are not eligible for the bonus");
			
			System.out.println("What is your annual salary?");
			
			int salary=user.nextInt();
			if (salary==50000) {
				System.out.println("Your bonus will be $5000");
			}else 
				System.out.println("Your bonus will be $3000");
			
			
	}

}
