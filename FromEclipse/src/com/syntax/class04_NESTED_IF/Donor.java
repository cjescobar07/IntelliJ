package com.syntax.class04_NESTED_IF;

public class Donor {

	public static void main(String[] args) {
		
		int age=31;
		int weight=300;
		
		if (age>=18) {
			System.out.println("We can donate your blood, but we need a list of requirements");
		}else
			System.out.println("Since you're not 18, we cannot donate your blood");
		if (weight>110) {
			System.out.println("Your weight matches our requirements");
		}else 
			System.out.println("Your weight requirement does not match");
		
		System.out.println("----------------------------");
		
		/* Else block cannot exist by itself
		 *  else{
		 * 			System.out.println("condition is false)"
		 * }
		 */
	}

}
