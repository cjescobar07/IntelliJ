package com.syntax.class12;

public class ObjectsClass_Task1 {
	
			// Create a Class “Phone”. Create 3 Objects of it: 
			// iPhone, Pixel, Nokia with specific  attributes and behaviors.
			
	String phone;
	String color; 
	int storage;
	boolean powerOn;
	boolean powerOff;
	
	void rings() {
		System.out.println("The phone rings and rings and rings");		
	}
	
	void powerOn() {
		System.out.println("The phone powers on");
	}
	void powerOff() {
		System.out.println("The phone powers off");
	}
	void printCompleteInfo() {
		System.out.println("phone = " + phone);
		System.out.println("color = " + color);
		System.out.println("storage size = " + storage);
		System.out.println("power on == "+ powerOn);
		System.out.println("power off == "+ powerOff);
	}	

	public static void main(String[] args) {
		ObjectsClass_Task1 iPhone = new ObjectsClass_Task1();
		iPhone.rings();
		iPhone.powerOn();
		iPhone.powerOff();
		iPhone.phone = "iPhone";
		iPhone.color = "Red";
		iPhone.storage = 125;
		iPhone.powerOn = true;
		iPhone.powerOff = true;
		iPhone.printCompleteInfo();
		
		System.out.println("-------------------");
		
		ObjectsClass_Task1 Pixel = new ObjectsClass_Task1();
		Pixel.rings();
		Pixel.powerOn();
		Pixel.powerOff();
		Pixel.phone = "Pixel";
		Pixel.color = "Black";
		Pixel.storage = 100;
		Pixel.powerOn = true;
		Pixel.powerOff = true;
		Pixel.printCompleteInfo();
		
		System.out.println("-------------------");
		
		ObjectsClass_Task1 Nokia = new ObjectsClass_Task1();
		Nokia.rings();
		Nokia.powerOn();
		Nokia.powerOff();
		Nokia.phone = "Nokia";
		Nokia.color = "Space Grey";
		Nokia.storage = 65;
		Nokia.powerOn = true;
		Nokia.powerOff = true;
		Nokia.printCompleteInfo();
		
		System.out.println("-------------------");
		
	}	
}
