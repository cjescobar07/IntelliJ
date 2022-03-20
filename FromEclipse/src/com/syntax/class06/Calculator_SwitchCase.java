package com.syntax.class06;

import java.util.Scanner;

public class Calculator_SwitchCase {

	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
		
		System.out.println("Please enter a number");		
		int num1=user.nextInt();
		
		System.out.println("Please enter an operator");		
		String operator=user.next();
		
		System.out.println("Please enter a second number");
		int num2=user.nextInt();
		
		int answer = 0;
		
		switch (operator) {
			case "+":
			answer=num1+num2;
			break;
			
			case "-":
				answer=num1-num2;
				break;
			case "*":
				answer=num1*num2;
				break;
			case "/":
				answer=num1/num2;
				break;
		}
		
			System.out.println(num1+operator+num2+ " = "+answer);
		
		

	}

}
