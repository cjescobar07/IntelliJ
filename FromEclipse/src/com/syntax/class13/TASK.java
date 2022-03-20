package com.syntax.class13;

public class TASK {
	
	// Create a method that takes a persons name and an animal name
	// if person name is "Chris" and if animal "Wolf" it returns as "lone wolf"
	
	
	String PersonAndAnimal (String name, String animalName) {
		if ("Chris".equalsIgnoreCase(name) && "Wolf".equalsIgnoreCase(animalName)) {
			return "Lone Wolf";
		}else if ("Wolf".equalsIgnoreCase(animalName)) {
			return "Wolf";
		}else {
			return "cub";
		}
		
		
	}

	
	public static void main(String[] args) {		
		TASK obj = new TASK();
		System.out.println(obj.PersonAndAnimal("Chris" , "Wolf"));
		System.out.println(obj.PersonAndAnimal(" " , "Wolf"));
		System.out.println(obj.PersonAndAnimal("wolf" , "little"));

		
	}
}
