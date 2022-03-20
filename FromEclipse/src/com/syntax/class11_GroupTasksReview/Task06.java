package com.syntax.class11_GroupTasksReview;

public class Task06 {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to check whether a given number is prime or not
		 */
		
		
		// If a number is not greater than 1, it is not prime
		// If a number is greater than 2, divide that number with all the numbers
		// and check if you get a remainder other than 0 if yes that number is 
		// not prime
		
		int number = 11;
		boolean isPrime = true;
		
		if (number>1) {
			for (int i = 2; i<number; i++) {
				if (number%i==0) {
					isPrime = false;
					break;
				}
			}
		}else {
			isPrime = false;
		}
		
		System.out.println(number + " isPrime " + isPrime);
		
		
		
		
		
		
		
		
		
		
		
		
 }
}
