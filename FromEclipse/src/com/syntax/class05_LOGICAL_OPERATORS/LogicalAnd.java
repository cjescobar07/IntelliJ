package com.syntax.class05_LOGICAL_OPERATORS;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/* AND = &&
		 * OR = ||
		 * NOT = !
		 * 
		 * 
		 * TRUE && TRUE --> TRUE
		 * FLASE && TRUE --> FALSE
		 * TRUE && FALSE --> FALSE
		 * FALSE && FALSE --> FALSE 
		 */
		
		boolean likeJava=true;
		boolean practice=true;
		boolean understandJava=true;
	
		if (likeJava&&practice&&understandJava) {
			System.out.println("Awesome");
			
		}
			System.out.println("End of code");	
			
			
			//We want to compare 3 numbers
			/*
			 * if num1 > num2 && num1 > num3 --> num1 is the largest
			 * what if num2 > num1 && num2 > num3 --> num2 is the largest
			 * what if num3 > num1 && num3 > num1 --> num3 is the largest 
			 */
			
			int num1=10;
			int num2=20;
			int num3=30;
			
			if (num1>num2 && num1>num3) {
				System.out.println(num1+" is the largest");
			}else if (num2>num1 && num2>num3) {
				System.out.println(num2+" is the largest");
			}else if (num3>num1 && num3>num2) {
				System.out.println(num3+" is the largest");
			}
			
			
			System.out.println("--------------------");
			
			int num4=10;
			int num5=20;
			int num6=31;
			
			int largest=0;
			
			if (num4>num5 && num4>num6) {
				largest=num4;
			}else if (num5>num4 && num5>num6) {
				largest=num5;
			}else if (num6>num4 && num6>num5) {
				largest=num6;
			}
			
			System.out.println(largest);
			
			System.out.println("--------------------");
			
			if (largest%2==0) {
				System.out.println(largest+" is even number");
			}else {
				System.out.println(largest+" is odd number");
			}
			
			System.out.println("--------------------");
			
			
	}

}
