package com.syntax.class12;

public class BashesCat {
	// Everything that ends with a semicolon (;) is a statement
	String name; 
	String color;
	String breed; 
	char gender;
	int age;
	int weight;
	
	void printCompleteInfo() {
		System.out.println("name is " + name);
		System.out.println("color is " + color);
		System.out.println("breed is " + breed);
		System.out.println("gender is " + gender);
		System.out.println("age is " + age);
		System.out.println("weight is " + weight + "lbs");
		}
	
	public static void main(String[] args) {
		
		BashesCat marinette = new BashesCat();
		marinette.name = "Marinette";
		marinette.color = "yellow";
		marinette.breed = "Cheetah";
		marinette.gender = 'F';
		marinette.age = 5;
		marinette.weight = 10;
		marinette.printCompleteInfo();
		
		

	}
}
