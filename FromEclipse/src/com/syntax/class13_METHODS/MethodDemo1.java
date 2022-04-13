package com.syntax.class13_METHODS;

import java.util.Scanner;

public class MethodDemo1 {

	// void is a type of method that doesn't return anything when called
	// "checkEvenOdd", "takesUmbrella", and "person" are example names of a method
	// we use parenthesis(), to pass information from outside 
	// "int num", "boolean isRaining", "String name" are examples of a parameter that we can pass to the method when called 
	// we can use this variable inside the logic of method
	
	void checkEvenOdd(int num){	
	if (num %2 == 0) {
		System.out.println(num + " is even");
	}else {
		System.out.println(num + " is odd");
	}
		
 }	
	
	void takesUmbrella(boolean isRaining) {
		if (isRaining) {
			System.out.println("Please take your umbrealla");
		}else {
			System.out.println("You don't need an umbrella");
		}
	}
	
	void person (String name) {
		if(name.equals("Chris")) {
			System.out.println(name + ", let's study more!");
		}else if(name.equals("Michelle")) {
			System.out.println("Hello " + name);
		}else {
			System.out.println("Who are you?!!");
		}
	}
	
public static void main(String[] args) {

	MethodDemo1 object1 = new MethodDemo1();
	object1.checkEvenOdd(200);
	object1.checkEvenOdd(555);
	object1.checkEvenOdd(778);
	object1.checkEvenOdd(1000);
	System.out.println("-------------------");
	
	object1.takesUmbrella(true);
	object1.takesUmbrella(false);
	System.out.println("-------------------");

	object1.person("Chris");
	object1.person("Michelle");
	object1.person("Sebastian");
	
	Scanner user = new Scanner (System.in);
	int num = user.nextInt();
	// int num2 = object1.checkEvenOdd(120); gives error since it cannot take any input in this example
 }
}
