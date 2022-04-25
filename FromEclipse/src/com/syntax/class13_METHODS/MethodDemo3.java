package com.syntax.class13_METHODS;

public class MethodDemo3 {


	// int we specify the datatype that method will return
	// squareTheNumber name of the method
	// (int number) parameters of the method
	// return tell java what to return from this method
	int squareTheNumber(int number) {

		return number * number;
	}

	int returnTheSameNumber(int number) {
		return number;
	}

	String getproperAnimalByExpert(String expertName, String animalName) {

		if ("Teyfur".equalsIgnoreCase(expertName) && "Horse".equalsIgnoreCase(animalName)) {
			return "camel";
		} else if ("Horse".equals(animalName)) {
			return "Horse";
		} else {
			return "I don't know";
		}
	}

	//create a method that takes a person name and an animal name
	//if person name is "Teyfur" and if animal is "Horse" it returns us "camel"
	//break till 8:55

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo3 obj = new MethodDemo3();
		int result = obj.returnTheSameNumber(5);
		System.out.println(result);
		System.out.println(obj.getproperAnimalByExpert("TEYFUR", "Horse"));
		System.out.println(obj.getproperAnimalByExpert("Tameer", "Horse"));
		System.out.println(obj.getproperAnimalByExpert("Tameer", "Monkey"));
	}
}