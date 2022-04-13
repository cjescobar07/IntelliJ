package com.syntax.class19_CONSTRUCTORS;

public class Human {
    String name;
    int age;
    double weight;
    char gender;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Important code");
        System.out.println("Important code");
        System.out.println("1");
    }

    public Human(String name, int age, double weight) {
        this(name, age);
        // this.name = name;
        // this.age = age;
        this.weight = weight;
        System.out.println("2");

    }

    public Human(String name, int age, double weight, char gender) {
        this(name, age, weight);
        // this.name = name;
        // this.age = age;
        // this.weight = weight;
        this.gender = gender;
        System.out.println("3");

    }
}
