package com.syntax.class06;

import java.util.Scanner;

public class REPLIT {

	public static void main(String[] args) {
			
		
		Scanner user=new Scanner (System.in);
		  System.out.println("Please enter two strings");
		  String word1=user.nextLine();
		  String word2=user.next();

		  System.out.println("Please enter two numbers");
		  int int1=user.nextInt();
		  int int2=user.nextInt();

		    if (int1==int2 && word1==word2){
		        System.out.println("AND");
		    }else if (int1==int2 || word1==word2){
		        System.out.println("OR");
		    }else if (!(int1==int2) && !(word1==word2) ){
		        System.out.println("NONE");
		    }


	}

}
