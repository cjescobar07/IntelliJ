package Group12_ProjectTasks;

public class Group12_Task07 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */

		int c = 0;
		int j = 1;
		int e;
		
		for (int i=0; i<10; i++) {
			System.out.print(c + " ");
		e = c+j;
		c = j;
		j = e;
		
	}
	System.out.println();
	System.out.println("------ANOTHER WAY------");	
	
		int m, d = 0, s = 1;
		m = 0;
		System.out.print("0 1 ");
		
		while (m<=30){
		m = d + s;
		System.out.print(m + " ");
		
		d = s;
		s = m;
	}
		
		
		
		
		
		
		
		
		
	}
}
