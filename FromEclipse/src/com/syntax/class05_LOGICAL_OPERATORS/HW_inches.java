package com.syntax.class05_LOGICAL_OPERATORS;

import java.util.Scanner;

public class HW_inches {

	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
			System.out.println("Please enter your height in inches");
		
		int height=user.nextInt();
		
		if (height <60) {
			System.out.println("You are short");
		}else if (height<=72) {
			System.out.println("You are medium");
		}else if (height>72) {
			System.out.println("You are tall");
		}
		
		
		
		

	}

}
