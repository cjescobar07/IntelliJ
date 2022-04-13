package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class LargestNumberSmallestNumber {

	public static void main(String[] args) {
		
		Scanner ce=new Scanner(System.in);
		
		System.out.println("first number");	
		int num1=ce.nextInt();
		System.out.println("second number");
		int num2=ce.nextInt();
		System.out.println("third number");
		int num3=ce.nextInt();
		
			if (num1>num2) {
				if (num1>num3) {
					System.out.println(num1+" is the largest number");
				}else if (num2>num1) {
					if (num2>num3) {
						System.out.println(num2+" is the largest number");
			}else 
				System.out.println(num3+" is the largest number");
				}
			}
	}
}
	
			
			
	
	

	
