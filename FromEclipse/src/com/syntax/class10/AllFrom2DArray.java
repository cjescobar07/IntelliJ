package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
	
	String[][] food = {
			
						{"Redbull", "Burger", "Steak", "Fries" },
						{"Curry", "Biriyani", "Butter Chicken"},
						{"Noodles", "Pad Thai", "Tom Yum"},	
						{"Pizza", "Pasta"}
			
	};
		System.out.println("----All VALUES FROM 2D ARRAY USING FOR EACH LOOP----");
	
		for(String[] foods : food) {
			System.out.println();
			
			for(String f:foods) {
				System.out.print(f + " ");
			}
			
			
		}
	System.out.println();
	System.out.println();
	System.out.println("-----Another Example-----");
	
		// iterates over every array / row
		for (int row=0; row<food.length; row++) {
			System.out.println();
		// iterate over every column of specified row
		for (int col=0; col<food[row].length; col++) {
			
		// accessing elements
			System.out.print(food[row][col] + " ");
		}
	}
		
		
		
		
		
		
		
		
	}
}
