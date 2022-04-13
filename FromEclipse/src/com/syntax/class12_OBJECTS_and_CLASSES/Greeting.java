package com.syntax.class12_OBJECTS_and_CLASSES;

public class Greeting {

	void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	void sayHelloManyTimes(String name) {
		for (int i = 0; i<5; i++) {
			System.out.println("Hello " + name);
		}
	}
	void sayHelloNumberOfTimes(String name, int times) {
		for (int i = 0; i<7; i++) {
			System.out.println("Hello " + name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeter = new Greeting();
		greeter.sayHello("Chris");
		
		System.out.println("-----------");
		
		Greeting greeters = new Greeting();
		greeters.sayHelloManyTimes("Chris");
		
		System.out.println("-----------");
		
		Greeting greetings = new Greeting();
		greetings.sayHelloNumberOfTimes("Chris",7);
		
		
		
	}
}
