package com.syntax.class05_LOGICAL_OPERATORS;

import java.util.Scanner;

public class NUMBERS_HW {
	
	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
			System.out.println("Please enter a number");
		
		int number=user.nextInt();
		
			if (number>=1 && number<=10) {
				System.out.println("is a small number");
			}else if(number>=11 && number<=100) {
				System.out.println("is a medium number");
			}else if (number>=101 && number<=1000){
				System.out.println("is a large number");
			}
		

	}

}
