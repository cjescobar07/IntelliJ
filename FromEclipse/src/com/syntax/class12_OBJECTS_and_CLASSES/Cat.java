package com.syntax.class12_OBJECTS_and_CLASSES;

public class Cat {
	// attributes, fields,and properties 
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	// behaviors, functions, and methods
	void meows() {
		System.out.println(name + " is meowing" );
	}
	void purrs() {
		System.out.println(name + " is purring");
	}
	void claws() {
		System.out.println(name + "is clawing");
	}
	
	void printCompleteInfo() {
		System.out.println("name = "+name);
		System.out.println("color = "+color);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);
		
	}	

	public static void main(String[] args) {
		
		Cat zelda = new Cat();
		// accessing the property name of object name "zelda" and setting its value.
		zelda.name = "zelda";
		zelda.color = "white";
		zelda.breed = "tiger";
		zelda.age = 5;
		zelda.weight = 10;
		zelda.meows();
		zelda.printCompleteInfo();
		System.out.println("---------------");
		
		Cat link = new Cat();
		link.name = "Link";
		link.color = "black";
		link.breed = "Panther";
		link.age = 5;
		link.weight = 15;
		link.meows();
		link.printCompleteInfo();
		
	}
}
