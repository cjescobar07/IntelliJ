package com.syntax.class11_GroupTasksReview;

public class Task04 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum 
		 * of even and odd numbers for that array.
		 */
		
		// 1. Create the 2d array
		// 2. Store Even and Odd numbers in the 2d array
		// 3. Access the elements
		// 4. Check if element is even, if EVEN add it to the sumEVEN variable
		// 5. Check if element is odd, if ODD add it to the sumODD variable
		// 6.Print the value of both variables
		
		
		int [][] array2d = {{2, 3, 4,}, 
							{5, 6},
							{8, 9, 10}};		

		int sumEven = 0;
		int sumOdd = 0 ;
		
			for (int x = 0; x<array2d.length; x++) {

				for (int y = 0; y<array2d[x].length; y++) {
					int element = array2d[x][y];
					if (element %2 == 0) {
						sumEven+=element;
				}else {
					sumOdd+=element;
				}
		
					
	}
				
}

			System.out.println("Sum of Even numbers is "+ sumEven);	
			System.out.println("Sum of Odd numbers is " + sumOdd);
		
		
			int sumEven2 = 0;
			int sumOdd2 = 0 ;
			
			for (int[] row : array2d) {

					for (int element : row) {						
						if (element %2 == 0) {
							sumEven2+=element;
					}else {
						sumOdd2+=element;
					}
			
						
		}
					
	}
			
			System.out.println("-------Another Way-------");
			System.out.println("Sum of Even numbers is "+ sumEven);	
			System.out.println("Sum of Odd numbers is " + sumOdd);
		
		
		
		
		
		
		
		
 }
}
