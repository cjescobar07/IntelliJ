package com.syntax.class06_SWITCH_STATEMENT;

import java.util.Scanner;

public class Grades_HW {

	public static void main(String[] args) {
		
		
		Scanner user=new Scanner (System.in);
			System.out.println("Enter your grade");
		
			String grade=user.nextLine();
			String answer;
			
			switch (grade.toLowerCase()) {
				case "a":
				answer="Excellent";
				break;
				
				case "b":
					answer="Good";
					break;
					
				case "c":
					answer="Average";
					break;
					
				case "d":
					answer="Bad";
					break;
					
				default:
					answer="Not accetpable";
			}
		
				user.close();
				System.out.println("Your are " +answer);
		
		
		
		
		
		
		
		
		

	}

}
