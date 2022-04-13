package com.syntax.class09_ARRAY;

public class AllValuesfromArray {

	public static void main(String[] args) {
		
		char[] grade={'A', 'B', 'C', 'D', 'E', 'F'};
		
		//how many elements inside array?
		int size=grade.length;
		System.out.println("The number of elements is = "+size);
		
		//System.out.println(grade[0]);
		//System.out.println(grade[1]);
		//System.out.println(grade[2]);
						
		for(int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		System.out.println();
		System.out.println("------------");
		/*
		 * for(int i=0; i<=grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		 *  java.lang.ArrayIndexOutOfBoundsException
		 * 
		 */
		
		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York City"};
		// if value is Miami --> I want live in Miami
		for (int a=0; a<cities.length; a++) {
			System.out.println(cities[a]+" ");
			
			if(cities[a].equals("Miami")) { //Example with adding if condition to array and for loop
			System.out.println("I want to live in Miami");
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
