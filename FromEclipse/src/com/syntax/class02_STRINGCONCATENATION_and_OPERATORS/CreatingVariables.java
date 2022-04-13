package com.syntax.class02_STRINGCONCATENATION_and_OPERATORS;

public class CreatingVariables {

	public static void main(String[] args) {
		
		//Always top to bottom 
		
		/*create a variable and assign value
		 * 
		 * declare a variable and initialize
		 */
		//1
		int age=25;
		
		//2
		int num; //declare variable
		num=10; //initialize it
		num=100;//reassign the value
		
		int n1, n2, n3; //all variable are on the int type
		
		n1=10;
		n2=20;
		n3=30;
		
		//ctrl+d --> will remove entire line
		
		//Can I change a value of the variable? Yes		
		age=26;// reassigning the value of variable age
		
		//age=26.5; ERROR: age variable can hold only int value
		
		age =57;
		age =75;
		
		System.out.println(age);

		//age=100; after the system output, will not work
		
		//Java Rules for identifiers 
		
		//boolean break=false; ERROR -->  1. do not use keyword as identifier
		
		//char 1character="A"; ERROR --> 2. Do not start identifier (name) with numbers
											//or special characters 
		
		//double %value=12.99; ERROR 2. Do not start identifier (name) with numbers
		//Java allows you to use _ OR $ as identifier
		
		double $price=1.99;
		double _value =2.99;
		
		char character1='a';	
		boolean Break=false;
		
		//not rules, but we prefer to use VARIABLES
		
		/* Variable and method names should start with lower case
		 * give variable a meaningful name
		 * 
		 * clase name should start with upper case 
		 * 
		 * if name has 2 or more words --> follow camel casing
		 */
		
		int bigNumber=12345; //Preferred preference; variable lower case / class upper case
		
		
		
	}
	
}
