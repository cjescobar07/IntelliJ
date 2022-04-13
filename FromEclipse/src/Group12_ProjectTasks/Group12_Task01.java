package Group12_ProjectTasks;

import java.util.Scanner;

public class Group12_Task01 {

	public static void main(String[] args) {
		/*
		 * Create an array on int values using a scanner 
		 * and calculate the sum of all stored elements in that array.
		 */

		Scanner user = new Scanner (System.in);	
		int[] num = new int [5];
		
		for (int i = 0; i<num.length; i++) {
			System.out.println("Please enter a number");
			num[i] = user.nextInt();
		}
		
		int sum = 0;
		for (int nums : num) {
			sum += nums;
		}
		System.out.println("The sum of all elements is: " + sum);
		
		
		
		
	}
}
