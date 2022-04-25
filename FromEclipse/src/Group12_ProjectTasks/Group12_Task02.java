package Group12_ProjectTasks;

import java.util.Arrays;

public class Group12_Task02 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		// Pseudo programming
		// 1) Create the 2D array
		// 2) Print the sum of all numbers

		// Create the 2D array
		int[][] array2D = {{10, 10, 10}, {20, 20, 20}, {30, 30, 30}};
		// print out the elements of an array with out a loops
		// System.out.println(Arrays.toString(array2D));
		// 4) sum all the elements of the array

		for (int i = 0; i < array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		System.out.println("**************");
		int sum = 0;
		for (int x = 0; x < array2D.length; x++) {
			System.out.println(Arrays.toString(array2D[x]));
			for (int y = 0; y < array2D[x].length; y++) {
				sum = sum + array2D[x][y];
			}
		}

		System.out.println("Sum of Array elements is " + sum);
		//break till 11:45
	}
}
