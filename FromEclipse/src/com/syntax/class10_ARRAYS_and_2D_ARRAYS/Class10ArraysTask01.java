package com.syntax.class10_ARRAYS_and_2D_ARRAYS;

public class Class10ArraysTask01 {

	public static void main(String[] args) {
		
		//create an array and retrieve all elements in reverse order 
		System.out.println("Printing array numbers (0-9) in reverse:");
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i] + " ");
		
		}
	
		System.out.println();
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	
		System.out.println();
		
		int[] arrs= {45,23,15,10,45,68,2,3,4};
		for(int i=0; i<arrs.length; i++ ) {
			System.out.print(arrs[arrs.length-i-1] + " ");
		}
		
		
	}	
}
