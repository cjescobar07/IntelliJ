package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {

		//WHILE loop is used when the number of repetition is unknown

		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("The value of i outside of while loop = "+i);
		
		// I need to print value from 2 to 20
		
		System.out.println("-----------------------------------------");
		int a=2;
		
		while (a<=20) {
			System.out.println(a);
		a++;
		}	
		System.out.println("The End");
		
		System.out.println("-----------------------------------------");
		int b=1;
		
		while (b<=50) {
			System.out.print(b+ " ");
		b++;
		}	
		
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		int d=20;
		
		while (d>=1) {
			System.out.print(d+" ");
		d--;
		}	
		
		System.out.println("The End");
		
		
		
		
		
	}

}
