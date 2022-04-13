package Group12_ProjectTasks;

public class Group12_Task02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. 
		 * Print the sum of all numbers.
		 */

		int[][] a = { {20,11,722,25}
		
					};
		
		    int sum=0;
		    
		    for (int i=0; i<a.length;i++){
		    	
		      for (int j=0;j<a[i].length;j++){		    	  
		        sum += a[i][j];
		      }
		      System.out.println(sum);
		    }
		
		
		
		
		
		
		
		
		
		
		
	}
}
