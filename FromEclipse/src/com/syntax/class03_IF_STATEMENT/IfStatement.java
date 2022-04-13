package com.syntax.class03_IF_STATEMENT;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * Scenario: I need to compare 2 numbers and I have to find which is bigger
		 */
		
		int num1=100;
		int num2=50;
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			}
		double money=5;
		double coffee=5;
		
		//IF I have more money than the coffee price --> I am buying coffee
		
		if (money>=coffee) {
			System.out.println("I am buying the coffee");
			}
			
			///if(money=coffee) {Error because IF condition must always be boolean
						//we use double --> because of the wrong operator
							// }
		
		
		
		

	}

}
