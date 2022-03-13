package com.syntax.class23;

public class Dog extends Animal{

    @Override // does not add any additional functionality
    void speak(){
        System.out.println("The dog *barks*");
    }
}
