package com.syntax.class20_CONSTRUCTORS;

public class Frog {

    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Frog(String name, String color, int age, double weight) {

        // this() should be the first line inside the constructor body
        this(name, color, age);
        // this.name = name;
        //this.color = color;
        //this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        // this() is not allowed inside the methods
        // this(name, color, age);
        System.out.println(name + " " +color+" "+age+" "+weight+"lb");

    }
}
