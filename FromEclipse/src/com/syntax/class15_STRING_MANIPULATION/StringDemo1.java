package com.syntax.class15_STRING_MANIPULATION;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String userName = "CHRIS";
		String password = "Chris123";
		
		if ("Chris".equals(userName) && "Chris123".equals(password)) {
			System.out.println("Welcome back");
		}else {
			System.out.println("UserName or password is not correct");
		}
		
		if ("Chris".equalsIgnoreCase(userName) && "Chris123".equalsIgnoreCase(password)) {
			System.out.println("Welcome back");
		}else {
			System.out.println("UserName or password is not correct");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
