package com.syntax.class11_GroupTasksReview;

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
		
		// Create a 2d array of integer values. Print the sum of all numbers.
		
		// 1. Create the 2d array.
		// 2. Print the sum of all numbers.
		
		int [][] array2d = {{10, 10, 10}, 
							{20, 20, 20},
		
							{30, 30, 30}};		
		int sum = 0;
		
		for (int x = 0; x<array2d.length; x++) {
			System.out.println(Arrays.toString(array2d[x]));
		for (int y = 0; y<array2d[x].length; y++) {
			 sum = sum+array2d[x][y];
 }
}
		System.out.println("Sum of Array elements is " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

 }
}
