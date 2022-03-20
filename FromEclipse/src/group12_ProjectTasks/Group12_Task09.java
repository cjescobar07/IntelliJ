package group12_ProjectTasks;

public class Group12_Task09 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array
		 * 
		 */

		  int[] num = {10, 5, 350, 150, 50, 100, 550, 110};
		
		  int largestNum = num [0];
		  int secondLargest = num [0];
		  
		  for (int i = 1; i<num.length; i++) {
			  if (num[i] > largestNum) {
				  secondLargest = largestNum;
				  largestNum = num[i];
			  }else if (num[i] > secondLargest) {
				  secondLargest = num[i];
			  }
			  
		  }
		
		System.out.println("The largest num is " + largestNum + " and the second largest num is " + secondLargest);
		
		
		
		
		
		
		
		
	}
}
