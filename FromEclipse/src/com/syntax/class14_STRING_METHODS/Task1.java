package com.syntax.class14_STRING_METHODS;

public class Task1 {

	//Create a method that will take 2 parameters as numbers and print which number is larger
	
	void printLarger(int num1, int num2) {
		if(num1>num2) {
			System.out.println("Number 1 is greater ");
		}else if(num2>num1) {
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("Numbers are the same");
		}
	}
	
public static void main(String[] args) {
	Task1 object = new Task1();
	object.printLarger(10, 12);
	object.printLarger(12, 10);
	object.printLarger(10, 10);
	
	
	
	
 }
}	
	
	
	
	
	
	
	
 
