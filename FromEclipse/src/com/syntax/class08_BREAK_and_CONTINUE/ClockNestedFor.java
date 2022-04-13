package com.syntax.class08_BREAK_and_CONTINUE;

public class ClockNestedFor {

	public static void main(String[] args) {
		
		
		/*
		 * Please try to complete a clock exercise.
		 * You can pick 12 or 24 hour clock.
		 * 
		 */

		for (int h=1; h<=12; h++) {
			for (int m=00; m<=59; m++) {
				for (int s=00; s<=59; s++) {
					
					System.out.println(h+"hr:"+m+"min:"+s+"sec");
				}
			}
		}
		
		System.out.println();
		System.out.println("-----------------------");
		
		for (int h=00; h<=23; h++) {
			for (int m=00; m<=59; m++) {
				for (int s=00; s<=59; s++) {
					
					System.out.println(h+"hr:"+m+"min:"+s+"sec");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
