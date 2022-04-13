package Group12_ProjectTasks;

public class Group12_Task03 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */

		
		int [][] num = { {132, 615, 1465},
						 {146, 165, 684},					 
						 {498, 849, 751},
						 {453, 998, 368},						 
					   };
		
			System.out.println("Find the even numbers only");
			
				
		for (int i = 0; i<num.length; i++) {
			
		for (int j = 0; j<num[i].length; j++) {
		
			if(num[i][j]%2==0) {
				System.out.print(num[i][j] + " ");
				
  }				
 }			
}
		
		System.out.println(" ");
		System.out.println("-----------------------");
		
		int[][] digit = {  {468, 164, 458},
						   {145, 153, 485},	
						   {489, 848, 786},
						   {355, 677, 268}, 
						};
						   
		for (int[] n : digit) {
		
			for(int e : n) {
				
				if (e%2==0) {
					System.out.print(e+ " ");
  }
 }
}
				
		
		
		
		
		
		
		
		
	}
}
