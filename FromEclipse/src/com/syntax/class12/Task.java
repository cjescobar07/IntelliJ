package com.syntax.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner user = new Scanner(System.in);
		  System.out.println("In:");
		  String name = user.nextLine();

		  String[] array = new String[5];

		  for(int i = 0; i<4; i++){
		    array[i]=user.next();
		    
		  }
		  for(String names : array){
		    System.out.println(names.substring(0,3));
		  }

		  
		
		
		
		
		
		
		
		
		
	}

}
