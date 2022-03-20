package com.syntax.class04;

import java.util.Scanner;

public class CreditCard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user=new Scanner(System.in);
			System.out.println("Do you have a credit card?");
			String cc=user.next();
			if (cc.equals("Yes")) {
				System.out.println("What is the balance on the card?");
			}else
				System.out.println("Would you like to open a credit line?");
			
			int balance=user.nextInt();
			if (balance>=1000) {
				System.out.println("Pay it off immediately");
			}else
				System.out.println("You can spend more!");
			
			
	}

}
