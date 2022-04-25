package com.syntax.class09_ARRAYS;

public class ArrayIntro {

	public static void main(String[] args) {
		
	int num=1;
	
	//creating an array that holds elements/values
	int[] numbers=new int[4]; 
	
	//storing values/element inside an array
	numbers[0]=90;	
	numbers[1]=87;	
	numbers[2]=89;	
	numbers[3]=99;	
	
	//print 99
	System.out.println(numbers[3]);
	System.out.println(numbers[3]+numbers[0]); //189	
	
	//I want to create an array of countries
	
	String[] countries=new String[5];
	countries[0]="USA";
	countries[1]="El Salvador";
	countries[2]="Mexico";
	countries[3]="Brazil";
	countries[4]="Dominican Republic";	
	
	
	System.out.println("I want to travel to the following countries: "+countries[3]+", "+countries[4]);
	
	System.out.println("------------");
	
	//System.out.printLn(countries[5]; ArrayIndexOutOfBoundsException
	
	String[] names=new String[5]; 
	names[0]="Chris";
	names[1]="Michelle";
	names[2]="Jacob's";
	names[3]="Sebastian's";
	names[4]="Dog";
	
	System.out.println(names[0]+" is "+names[2]+" and "+names[3]+" dad.");
	
	
	System.out.println("------------");
	
	//Create an array to store 4 different prices
	//find an average of how much we spent
	
	double[] price=new double[4];
	
	price[0]=9.99;
	price[1]=19.99;
	price[2]=29.99;
	price[3]=39.99;
	
	double avg=(price[0] + price[1] + price[2] + price[3]) /4;
	System.out.println(avg);
	
	
	
	
	
	
			
	}
}
