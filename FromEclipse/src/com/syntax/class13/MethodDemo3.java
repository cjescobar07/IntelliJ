package com.syntax.class13;

public class MethodDemo3 {
	
	
	// int we specify the datatype that method will return
	// squareTheNumber is the name of the method
	// int(number) is the parameters of the method
	// return tells Java what to return from the method
	
	int squareTheNumber(int number) {
		return number*number;
	}	
	
	int returnTheSameNumber(int number) {
		return number;
	}	


	public static void main(String[] args) {
		
		MethodDemo3 obj = new MethodDemo3();
		int result = obj.squareTheNumber(5);
		int result2 = obj.returnTheSameNumber(5);
		System.out.println("5 X 5 = " + result);
		System.out.println(result2 + " has been returned");
		
		
		
		
		
	}
}
