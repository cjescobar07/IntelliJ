package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		// Abbc =>false
		
		String palindrome = "aba";
		
		if("aba".equalsIgnoreCase(palindrome)) {
			System.out.println(true);
		}else if ("Abbc".equalsIgnoreCase(palindrome)) {
			System.out.println(false);
		}else {
			System.out.println("Error");
		}
		
		
		
		
		
	}
}
