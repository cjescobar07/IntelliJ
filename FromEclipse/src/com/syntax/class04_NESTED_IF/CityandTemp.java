package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class CityandTemp {

		public static void main(String[] args) {
			
			/*Create a Java program that will ask user to input city and temperature. 
			 * Your program should convert Fahrenheit into celsius 
			 * and print �The temperature is the city __ is __�
			 */
			
			Scanner user=new Scanner(System.in);
				System.out.println("Please state your city");
				String city=user.next();
				
				System.out.println("What is your current temp in Fahrenheit?");
				int fahrenheit=user.nextInt();
				int celcius=(fahrenheit - 35)*5/9;
				
				System.out.println("The current temp in "+city+" is "+celcius+" degrees celcius");
			
			
			
			
		}
	
	
}
