package com.syntax.class23_METHOD_OVERRIDING;

public class MainDemo {
    public static void main(String[] args) {

    // method overriding = Declaring a method in a sub class;
    //                     which is already present in a parent class
    //                     Done so that a child class can give its own implementation

    Animal animal = new Animal();
    animal.speak();


    Dog dog = new Dog();
    dog.speak();


  }
}
