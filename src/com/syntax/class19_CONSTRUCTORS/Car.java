package com.syntax.class19_CONSTRUCTORS;

public class Car {
    String name = "Honda";
    String make;
    String color;
    String type;

    Car(String name, String make, String color, String type){
       /*
       If we have same local and instance variables, Java will always prefer local variables
       If you want to instruct Java to use instance variables, we use "this" keyword
        */

     this.name = name;
     this.make = make;
     this.color = color;
     this.type = type;
    }
    Car(){
    }
    void PrintCar(){
        String name = "Telsa";
        System.out.println(name);
        System.out.println(this.name);
    }
}
