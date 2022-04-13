package com.syntax.class09_ARRAY;

public class ForEachLoop {

	public static void main(String[] args) {		
		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York City"};
		
		//If you have an array, you can use for each loop to iterate/loop through the entire array
		
		for(String city:cities) {
			System.out.println(city+" ");
		}
		
		System.out.println("-----------------");
		
		int[] numbers = {10, 20, 30, 40};
		
		for (int num:numbers) {
			System.out.println(num+" ");
		}
		
		System.out.println("-----------------");
		
		char[] grades= {'A', 'B', 'C', 'D'};
		
		for (char grade:grades) {
			System.out.println(grade+" ");
		}
		
		System.out.println("-----------------");
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="El Salvador";
		countries[2]="Mexico";
		countries[3]="Brazil";
		countries[4]="Dominican Republic";	
		
		for (String country:countries) {
			System.out.println(country+" ");
		}
		
		
		
		int [][] a = {
				{1, 1, 2},
				{3, 1, 2},
				{3, 5, 3},
				{0, 1, 2}
		};
		
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				sum += a[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
		
		
		
		
		
	}
}
