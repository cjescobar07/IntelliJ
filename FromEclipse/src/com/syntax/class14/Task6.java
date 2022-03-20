package com.syntax.class14;

public class Task6 {
	
	/*
	 * Task 6
	 * Create class Student that will have a method getGrade. Your method
	 * should accept the score of a student and return a grade: 
	 * score > 90 - A 
	 * score >80 - B 
	 * score >70 - C 
	 * score > 50 - D 
	 * anything else - F
	 */
	
	char getGrade(int score) {
		if (score >= 90 ) {
			return 'A';
		}else if (score >= 80 && score <90) {
			return 'B';
		}else if (score >= 70 && score <80) {
			return 'C';
		}else if (score >= 50 && score <70) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	public static void main(String[] args) {

		Task6 task = new Task6();
		System.out.println(task.getGrade(75));
		
		
	}		
}
