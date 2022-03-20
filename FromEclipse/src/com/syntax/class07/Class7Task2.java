package com.syntax.class07;

public class Class7Task2 {

	public static void main(String[] args) {

		// Print numbers from 1 to 100 in 1 line with space
		// Print numbers from 100 to 1
		// Print even numbers from 20 to 100 
		// Print only odd numbers from 100 to 1
		
		int a=1;
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		System.out.println("--------------------------");
		
		int b=100;
		while (b>=1) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		System.out.println("--------------------------");
		
		
		int c=20;
		while (c<=100) {
		if (c%2==0) {
			System.out.print(c+" ");
			
		}
		c++;
	}
		System.out.println();
		System.out.println("--------------------------");
		
		int d=101;
		while (d>=0) {
			System.out.print(d+" ");
			d-=2;
		}
		
		
				
	}

}
