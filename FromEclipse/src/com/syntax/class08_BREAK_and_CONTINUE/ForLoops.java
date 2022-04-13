package com.syntax.class08_BREAK_and_CONTINUE;

public class ForLoops {

	public static void main(String[] args) {

		for (int i=1; i<=3; i++) {
			System.out.println("Hello "+i);			
		}
		System.out.println();
		System.out.println("MULTIPLCATION TABLE");
		
		/* Multiplication by 3
		 *  3 X 1 = 3
		 *  3 X 2 = 6
		 *  3 X 3 = 9
		 * 
		 */
		
		 int num=6;
		 int result;
		 
		 for (int i=1; i<=10; i++) {

			 result=num*i;
			 System.out.println(num+" X "+i+" = "+result);
		 }
		System.out.println();
		System.out.println(" -What IS THE OUTPUT- ");
		
		for (int i=0; i<=10; i+=3) {
			System.out.println(i+" ");
		}		
		System.out.println();
		System.out.println(" -What IS THE OUTPUT- ");
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum+=i; //also known as sum=sum+i;
			System.out.println(sum);
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println();
		System.out.println(" -What IS THE OUTPUT- ");
		
		int value=1;
		
		for (int i=1; i<4; i++) {
			
			value*=i;
		}
		System.out.println(value);
		
		
		/*
		 * I want to find out the sum of all even and all odd numbers from the range 1 -50
		 */
		System.out.println("----------------------------------------------------------------");
		
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
			sumEven=sumEven+i;
			
		}else {
			sumOdd=sumOdd+i;
		}
	}
		System.out.println("The sum of all even numbers = "+sumEven+" and the sum of all odd numbers = "+sumOdd);
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("ANOTHER WAY TO FIND SUM OF EVEN AND ODD NUMBERS ");
		
		sum=0;
		
		for(int i=2; i<=50; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		int sum1=0;
		for (int i=1; i<=50; i+=2) {
			sum1+=i;
		}
		System.out.println(sum1);

	}
}
