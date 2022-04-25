package com.syntax.class09_ARRAYS;
public class Recap {

	public static void main(String[] args) {
		
		for( int i=1; i<=4; i++) {
			System.out.println("A");
			//break;
			System.out.println("B");
		}
	
			System.out.println("---------------------");
		
		for(int i=1; i<=3; i++) { //outer loop controls number of complete iteration of inner loop
						
			for (int j=1; j<=3; j++) { //inner loops always depends on outer loop
				System.out.println("Hello");
				break;
			}
			
			System.out.println("Good Morning");
			
		}
		
			System.out.println("---------------------");
		
		for(int i=1; i<=3; i++) { //outer loop controls number of complete iteration of inner loop
						
			for (int j=1; j<=3; j++) { //inner loops always depends on outer loop
				System.out.println("Hello");
				break;
			}
			
			System.out.println("Good Morning");
			break;
		}
		
			System.out.println("---------------------");
		
		for(int i=0; i<=3; i++) { //outer loop controls number of complete iteration of inner loop
			System.out.println("Hello");
			
			for (int j=1; j<=4; j++) { //inner loops always depends on outer loop
			System.out.println("Good morning"); 
			}
			
		}
		
			System.out.println("---------------------");
			
		for(int i=0; i<=2; i++) { //outer loop controls number of complete iteration of inner loop
			
			if (i==1) {
				continue;
			}
			for (int j=1; j<=3; j++) {
				
				if (j==2) {
				break;
				
				}
				System.out.println("Good Morning");
				
		}
			
			System.out.println("Hello");
		}
			
		
	}
}

