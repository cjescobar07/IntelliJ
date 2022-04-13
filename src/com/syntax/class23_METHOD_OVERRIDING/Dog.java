package com.syntax.class23_METHOD_OVERRIDING;

public class Dog extends Animal{

    @Override // does not add any additional functionality
    void speak(){
        System.out.println("The dog *barks*");
    }
}
