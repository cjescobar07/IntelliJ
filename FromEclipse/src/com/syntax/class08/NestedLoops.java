package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i=1; i<=3; i++ ) {
			System.out.println("I am i loop "+i);		
				
		for (int j=1; j<=2; j++) {
			System.out.println("I am nested j loop "+j);
		}
		
	}
		
		System.out.println("----------ANOTHER EXAMPLE-----------------");		
		
		for (int i=1; i<=4; i++) {
			System.out.print(i);
			
		for (int j=1; j<=3; j++) {
			System.out.print(j);
		}
	}
		System.out.println();
		System.out.println("----------CAR MILEAGE EXAMPLE-----------------");
		
		for (int a=0; a<=9; a++) {
			for (int b=0; b<=9; b++) {
				for (int c=0; c<=9; c++) {
					System.out.println(a+" "+b+" "+c);
				}
			}
		}
		
		
		
		
		
		

	}
}
