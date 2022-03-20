package com.syntax.class12;

public class ObjectsClass_Task02 {
	
			// Create a Dog Class and create 3 different objects of it: 
			// Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
		String name;
		String color;
		int weight;
		boolean sheds;
		char gender;
		
	void barks() {
		System.out.println("The " + name + " barks a lot.");
	}
	void eats() {
		System.out.println("The " + name + " eats a lot. ");
	}
	void runs() {
		System.out.println("The " + name + " runs a lot. ");
	}
	void printCompleteInfo() {
		System.out.println("The breed of this dog is a "+ name);
		System.out.println("The color of the " + name + " is "+ color);
		System.out.println("The weight of the " + name + " is " + weight+" lbs");
		System.out.println("Does the dog shed?"+ " " + sheds);
		System.out.println("Gender of the dog is " + gender);
	}
		

	public static void main(String[] args) {
		
		ObjectsClass_Task02 husky = new ObjectsClass_Task02();
		husky.name = "Husky";
		husky.color = "grey";
		husky.weight = 60;
		husky.sheds = true;
		husky.gender = 'M';
		husky.barks();
		husky.eats();
		husky.runs();
		husky.printCompleteInfo();
		
		System.out.println("-----------------");
		
		ObjectsClass_Task02 labrador = new ObjectsClass_Task02();
				labrador.name = "Labrador";
		labrador.color = "grey";
		labrador.weight = 80;
		labrador.sheds = true;
		labrador.gender = 'F';
		labrador.barks();
		labrador.eats();
		labrador.runs();
		labrador.printCompleteInfo();
		
		System.out.println("-----------------");
		
		ObjectsClass_Task02 bulldog = new ObjectsClass_Task02();
		bulldog.name = "Bulldog";
		bulldog.color = "grey";
		bulldog.weight = 75;
		bulldog.sheds = true;
		bulldog.gender = 'F';
		bulldog.printCompleteInfo();
		bulldog.barks();
		bulldog.eats();
		bulldog.runs();
		
		
		
		
		
		

	}
}
