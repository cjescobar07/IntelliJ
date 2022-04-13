package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class CityandTemp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner user=new Scanner(System.in);
			System.out.println("Please enter your city and current temperature");
			String city=user.next();
			int tempF=user.nextInt();			
			double tempC=(tempF-32)*5/9;
			
			System.out.println("Temperature in celcius is "+tempC);
		
		
	}

}
