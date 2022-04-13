package com.syntax.class05_LOGICAL_OPERATORS;

import java.util.Scanner;

public class WeekDayHW2 {
	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
		System.out.println("What day is it?");
		
		int day=user.nextInt();
		
		
			if(day>=1 && day<=5) {
				System.out.println("It is a weekday");				
			} else if (day>=6 && day<=7) {
				System.out.println("It is a weekend");
				
			}
		

	}

}
