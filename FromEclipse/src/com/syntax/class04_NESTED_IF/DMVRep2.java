package com.syntax.class04_NESTED_IF;

import java.util.Scanner;

public class DMVRep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner customer=new Scanner(System.in);
			System.out.println("How  old are you?");
			
			int age=customer.nextInt();			
			if (age>=18) {
				System.out.println("You will get your Driver's Licesne");
			}else {
				System.out.println("You will get a learner's permit!");
			}

	}

}
