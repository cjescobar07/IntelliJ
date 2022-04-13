package com.syntax.class05_LOGICAL_OPERATORS;

import java.util.Scanner;

public class WeekDayHW {

	public static void main(String[] args) {
		
		Scanner week=new Scanner (System.in);
		int day=week.nextInt();
		
		if (day>=1 && day<=5)  {
			System.out.println("It is a weekeday");
		}else if(day>=6 && day<=7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		
		
		
		
		
	
	}

}
