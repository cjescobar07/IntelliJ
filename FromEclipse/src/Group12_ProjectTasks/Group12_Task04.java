package Group12_ProjectTasks;

public class Group12_Task04 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of  even and odd numbers for that array.
		 */

		// 1) Create the 2D array
		// 2) Store Even and odd numbers in the 2D array
		// 3) Access the elements
		// 4) check the if element is even if it is add it to sumEven variable
		// 5) check the if element is odd if it is add it to sumOdd variable
		// 6) print the values of both variables

		int[][] array2D = { { 2, 3, 4 }, { 5, 6 }, { 12, 6, 8 } };
		int sumEven = 0;
		int sumOdd = 0;
		for (int[] row : array2D) {
			for (int element : row) {
				if (element % 2 == 0) {
					sumEven += element;
				} else {
					sumOdd += element;
				}
			}
		}
		System.out.println("Sum of Even numbers " + sumEven);
		System.out.println("Sum of Odd numbers " + sumOdd);
	}
}
