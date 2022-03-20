package com.syntax.class10;

public class Class10_2DArrays {

	public static void main(String[] args) {
		
		int[][] numbers = new int[3][4];
		
		//first row or first array
		numbers  [0][0]=10;
		numbers  [0][1]=20;
		numbers  [0][2]=30;
		numbers  [0][3]=40;		
			
		//Second row or second array
		numbers  [1][0]=100;
		numbers  [1][1]=200;
		numbers  [1][2]=300;
		numbers  [1][3]=400;		
				
		//Third array
		numbers  [2][0]=1000;
		numbers  [2][1]=2000;
		numbers  [2][2]=3000;
		numbers  [2][3]=4000;
				
	
		System.out.println(numbers[1][2]); //300
		System.out.println(numbers [0][1] + numbers[1][0]); //120
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
