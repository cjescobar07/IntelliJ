package com.syntax.class12_OBJECTS_and_CLASSES;

public class Dog {
	// Everything that ends with a semicolon (;) is a statement
	// attributes, fields,and properties 
	
	String name; 
	String color;
	String breed;
	char gender; 
	int age;
	double weight;
	
	// behaviors, functions, and methods
	void  barks() {
		System.out.println("Dog is barking...");
	}
	
	void eats() {
		System.out.println("Dog is eating...");
	}
	
	void sleeps() {
		System.out.println("Dog is sleeping...");
	}
	
	public static void main(String[] args) {
		//Creating an object "scooby" from "class Dog"
		Dog scooby = new Dog();
		//Dog is class
		//scooby is an object
		// = is an assignment operator
		// new is a keyword that we use to create the objects of a class
		// Dog() --> we are calling the constructor of the class
		//Scanner scan = new Scanner(System.in);
		scooby.barks();		
		scooby.eats();
		scooby.sleeps();
		
		
		
		
		
		
		
		
	}
}
