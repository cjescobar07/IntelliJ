package com.syntax.class02_STRING_CONCATENATION_and_OPERATORS;

public class NonPrimitiveType {

	public static void main(String[] args) {
		
		String name="Christian"; //String is a non primitive datatype
		
		String lastname ="Escobar"; 
		
		long phonenumnber =952613256226258882l;
		
		String mobileNumber ="123456789";
		
		String num="123";
		int num1=123;
		
		String greeting="Hello Friends !"; 

		System.out.println(greeting);
		
		//syso+ctrl+space --> auto complete print statement
		
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(name+" "+lastname);
		
		/*Using + we can attach 
		 * String +String
		 * String + int
		 * String + boolean
		 * String + double
		 * String + chac etc...
		 */
		
		int age=25;
		//Christian is 25 years old
		
		
		System.out.println(name+" is "+age +" years old");
		
		String address="123 Test Street";
		
		//I live on 123 Test Street
				
		System.out.println("I live on "+address);
		
		String feeling="like";
		String food="kebab";
		
		//I like kebab
		System.out.println("I "+feeling+" "+food);
		
		feeling="love";
		food="shrimp";
		
		//I love shirmp
		System.out.println("I "+feeling+" "+food);
		
		char symbol='S';
		System.out.println(symbol);
		
		
		
		
	}	

}
