package com.syntax.class10;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		
		int [][] nums = { {10, 20, 30, 40, 50, 60, 70, 80},
						{100, 200, 300, 400, 500,},
						{1000, 2000, 3000, 4000, 5000, 6000},	
		};
		
		// nums.length --> give # of rows
		int size=nums.length; //when used with 2D arrays give # of 1D arrays that we stored		
		System.out.println(size); //3
	
		int sizeOf1Array=nums[0].length;
		System.out.println("Size of 1st array: " + sizeOf1Array); //4
		
		int sizeOf2Array=nums[1].length;
		System.out.println("Size of 2nd array: " + sizeOf2Array); //5
		
		int sizeOf3Array=nums[2].length;
		System.out.println("Size of 3rd array: " + sizeOf3Array); //6
		
		System.out.println();
		
		for (int i=0; i<nums.length; i++) {
			System.out.println();
			
		for (int j=0; j<nums[i].length; j++) {
			System.out.print(nums[i][j] + " ");
		
  }
}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
