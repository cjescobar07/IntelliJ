package com.syntax.class15_STRING_MANIPULATION;

public class Task1 {

	public static void main(String[] args) {
		
		String userName = "Chris";
		String password = "pass1234";
		String confirmedPassword = "pass1234";
		
		if(userName.isEmpty() || password.isEmpty()){
			System.out.println("User and Password cannot be empty.");
		}else {
			
			if (password.length()<8) {
				System.out.println("Password is too short");
			}else {
				if(password.contains(userName)) {
					System.out.println("Password cannot contain username");
				}else {
					if(password.equals(confirmedPassword)) {
						System.out.println("Your username and password have been created");
					}else {
						System.out.println("Passwords do not match");
					}
				}
			}
		}
		
		

	}
}
