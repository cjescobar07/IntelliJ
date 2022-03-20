package com.syntax.class11_GroupTasksReview;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Create an array on int values using a scanner 
		 * and calculate the sum of all stored elements in that array.
		 */
		
		// Pseudo programming
		// 1. Take the size of the Array using scanner class from the user
		// 2. Create an int array of the above size
		// 3. Fill the array with elements from the user using scanner class
		// 4. Sum of all the elements of the array 
		
		Scanner user = new Scanner (System.in);	// Prompt the user for the size
		System.out.println("Please enter the size of the Array"); // Take the size from the user and store it in the size variable
		int size = user.nextInt(); // Print out the size
		
		System.out.println("The size of the Array is " + size);
		System.out.println();
		
		// 2. Create an int array of the above size
		int[] array = new int[size]; // fill in the array with elements from the user using scanner class
		
		System.out.println("Please enter " + size + " Elements");
		for (int i = 0; i<size; i++) {
			
			System.out.println("What is the element for index " + i);
			array[i] = user.nextInt();
		}
		
		// print out the elements of an array without using loop
		System.out.println(Arrays.toString(array));
		
		// 4. Sum of all elements of the array-		
		int sum = 0;
		for (int x = 0; x<size; x++) { // can also say for(int x = 0; x<array.length; x++) {}
			sum = sum+array[x];  // sum+ = array[x];
		}
		System.out.println("Sum of array elements is " + sum);
		
		
		
		
		
 }
}
