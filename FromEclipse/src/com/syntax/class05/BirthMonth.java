package com.syntax.class05;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		
		Scanner birth=new Scanner (System.in);
			System.out.println("Please enter your birth month");
		
			String birthmonth=birth.nextLine();
			
					
			if (birthmonth.equalsIgnoreCase("March") || birthmonth.equalsIgnoreCase("April") || birthmonth.equalsIgnoreCase("May")) {
				System.out.println("You were born during Spring");
			}else if (birthmonth.equalsIgnoreCase("June") || birthmonth.equalsIgnoreCase("July") || birthmonth.equalsIgnoreCase("August")) {
				System.out.println("You were born during Summer");
			}else if (birthmonth.equalsIgnoreCase("September") || birthmonth.equalsIgnoreCase("October") || birthmonth.equalsIgnoreCase("November")){
				System.out.println("You were born during Fall");
			}else if (birthmonth.equalsIgnoreCase("December") || birthmonth.equalsIgnoreCase("January") || birthmonth.equalsIgnoreCase("February")) {
				System.out.println("Yoy were born during Winter");
			}else {
				System.out.println("Invalid");
			}	
		
		
		

	}

}
