package com.syntax.class11_GroupTasksReview;

import java.util.Arrays;

public class Task03 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		// Create the 2d array
		// Store even and odd numbers in the 2d array
		// Access the elements
		// Print the elements if they are even
		
		
		int [][] array2d = {{2, 3, 4,}, 
							{5, 6},
							{8, 9, 10}};		
		

		for (int x = 0; x<array2d.length; x++) {
			
			for (int y = 0; y<array2d[x].length; y++) {
				int element = array2d[x][y];
				if (element %2 ==0) {
					System.out.println(element);
				}
				
		}
}
		

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			 
	     int num = 0;
		for (int i = 0; i<a.length; i++){
	    for (int j = 0; j<a[i].length; j++){
	      if (a[i][j] < 0 && a[i][j] != 1){
	        num--;
	      }
	    }
	  }	 System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
 }
}
