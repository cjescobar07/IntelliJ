package com.syntax.class05;

import java.util.Scanner;

public class Grade_HW {

	public static void main(String[] args) {
		
		Scanner user=new Scanner (System.in);
			System.out.println("Quiz score?");		
		int quiz=user.nextInt();
			
			System.out.println("Midterm score?");
		int midterm=user.nextInt();
		
			System.out.println("Final score?");
		int finalscore=user.nextInt();
		
		int score=(quiz+midterm+finalscore)/3;
			
		if (score>=90) {
			System.out.println("Your grade is an A");
		}else if (score>=70 && score<90) {
			System.out.println("Your grade is a B");
		}else if (score>=50 && score<70) {
			System.out.println("Your grade is a C");
		}else if (score<50) {
			System.out.println("Your grade is an F");
		}
		
		
		
		
		
		
		

	}

}
