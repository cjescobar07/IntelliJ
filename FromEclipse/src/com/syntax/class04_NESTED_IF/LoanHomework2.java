package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class LoanHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner user=new Scanner(System.in);
			System.out.println("How much are you asking?");
			int loanAmount=user.nextInt();
			System.out.println(loanAmount);
		if (loanAmount<=200000 ) {
			System.out.println("Congratulations, you qualify for a loan!");
		}else 
			System.out.println("Sorry, your request has been denied.");
		
	}

}
