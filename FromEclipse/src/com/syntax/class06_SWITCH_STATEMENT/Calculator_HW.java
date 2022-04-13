package com.syntax.class06_SWITCH_STATEMENT;

import java.util.Scanner;

public class Calculator_HW {

	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
			
		
		System.out.println("Please enter a number");
		int num1=user.nextInt();
		
		
		System.out.println("Enter a math operator");
		String operator=user.next();
		
		System.out.println("Please enter a second number");
		int num2=user.nextInt();
		
		int answer=0;
		
		if (operator.equals("+")) {
			answer=num1+num2;
		}else if (operator.equals("-")) {
			answer=num1-num2;
		}else if (operator.equals("*")) {
			answer=num1*num2;
		}else if (operator.equals("/")) {
			answer=num1/num2;
		}
		
			
			System.out.println(num1+operator+num2+" = "+answer);
		
			System.out.println("----------------------------------");
		

	}

}
