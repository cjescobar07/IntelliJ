package com.syntax.class23_METHOD_OVERRIDING;

public class Dog2 {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    // Overloading the constructor
    Dog2(){
        System.out.println("No argument constructor ");
    }
    Dog2(String name){
     this.name = name;
    }

    public Dog2(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    void changeInfo(){
        this.name = name;
    }

    void changeInfo(String name, String color){
        this.name = name;
        this.color = color;
    }
    void changeInfo(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog2{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    //Topics needed to revise
    // if else conditions
    // loops
    // methods
    // inheritance(kinda required)
    // Constructor and this keyword
    // Access modifiers - public, private, protected
    // types of variables
    //

}
