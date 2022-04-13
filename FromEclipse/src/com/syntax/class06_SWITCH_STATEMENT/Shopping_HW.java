package com.syntax.class06_SWITCH_STATEMENT;

import java.util.Scanner;

public class Shopping_HW {

	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
			System.out.println("Is there a sale going on today?");
			String sale=user.nextLine();
			
		switch (sale) {
		
		
			case "no":
			System.out.println("You are not going shopping today");
				break;
			
			case "yes":
			System.out.println("What is the sale price of this item?");			
			
			double price=user.nextDouble();
			double percentage;
			
			if (price<20) {
				percentage=0.1;
			}else if (price>=20 && price <=100) {
				percentage=0.2;
			}else if (price>=101 && price<=500) {
				percentage=0.3;
			}else {
				percentage=0.5;
			}
			
			double discount= price*percentage;
			double afterDiscount=price-discount;
			
			System.out.println("After the discount of $"+discount+", "+ "the price of the item is reduced from $"+price+" to $"+afterDiscount );
			
			break;
		
		default:
				
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
