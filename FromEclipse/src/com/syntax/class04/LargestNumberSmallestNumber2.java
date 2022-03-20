package com.syntax.class04;

import java.util.Scanner;

public class LargestNumberSmallestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner number=new Scanner(System.in);
			System.out.println("What is the first number?");
			int num1=number.nextInt();
			
			System.out.println("What is the second number?");
			int num2=number.nextInt();
			
			System.out.println("What is the third number?");
			int num3=number.nextInt();
			
			if (num1>num2) {
				System.out.println(num1+" is the largest number");
			}else if (num2>num3) {
				System.out.println(num2+" is the largest number");
			}else if (num3>num1) {
				System.out.println(num3+" is the largest number");
			}
		
	
			
			
	}

}
