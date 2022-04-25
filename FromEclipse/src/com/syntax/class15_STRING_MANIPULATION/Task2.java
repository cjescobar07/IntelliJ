package com.syntax.class15_STRING_MANIPULATION;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads two people's first names and if they expecting boy or girl? 
		 * Based on the input suggests a name for a baby:
		 * Example Output:
		 * Mom�s first name? Mary
		 * Dad�s first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: DANRY
		 * Example Output:
		 * Mom�s first name? Mary
		 * Dad�s first name? Daniel
		 * Boy or Girl? girl
		 * Suggested baby name: MAIEL
		 *  
		 */

		String father="Dan";
		String mother="Mariam";
		String expectation="boy";
		String firstPart="";
		String secondPart="";
		if(expectation.equalsIgnoreCase("boy")) {
			firstPart=father.substring(0,father.length()/2);
			secondPart=mother.substring(mother.length()/2);
		}else if(expectation.equalsIgnoreCase("girl")){

			firstPart=mother.substring(0,mother.length()/2);
			secondPart=father.substring(father.length()/2);
		}
		System.out.println(firstPart+secondPart);
	}
}
