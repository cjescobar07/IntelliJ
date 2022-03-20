package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	
		public static void main(String[] args) {
			
			/* Create a Java program that will ask if user has a credit card or not. 
			 * If your user does not have a credit card then offer them. If they do have one ask what is balance on the card? 
			 * If balance of the card is larger than 1000, tell them to pay off immediately, 
			 * otherwise you can tell them that they can spend more.
			 */
			
			Scanner user=new Scanner(System.in);
			 System.out.println("Do you have a credit card?");
			 String cc=user.next();
			 
			 if (cc.equals("Yes")){
				 System.out.println("What is the balance on the card?");									 
			}else if (cc.equals("No")) { 
					System.out.println("Would you like to open a credit line today?");
			}String balance=user.next();
			 
			 if (balance.equals("1000")) {
				 System.out.println("You need to pay off immediately");
			 }else {
				 System.out.println("You can spend more");
			 }
			}

		}
    
    
