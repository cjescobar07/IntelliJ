package com.syntax.class04_NESTED_IF;

public class Task2 {

	public static void main(String[] args) {
		
		double mortageRate=2.5;
		int mortagePrice=100000;
		
		if (mortageRate>4.5) {
			System.out.println("You cannot buy a house");
		}else {
			System.out.println("You can buy a house");
			
		if (mortagePrice < 50000) {
			System.out.println("You should take a loan");
		}else {
			System.out.println("You can pay cash");
		}
		}
	}

}
