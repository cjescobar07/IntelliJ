package Group12_ProjectTasks;

public class Group12_Task08 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */

		int[] nums = {1465, 14536, 4651, 516};
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 0; i<nums.length; i++) {
			
			if(nums[i]>max) {
				max = nums[i];	
				
		   }else if (nums[i]<min) {
			   min = nums[i];
		   }
			
		}
		System.out.println("Largest array: " + max);
		System.out.println("Smallest array: " + min);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
