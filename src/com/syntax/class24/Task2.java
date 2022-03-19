package com.syntax.class24;

public class Task2 {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new Lenovo(), new HP(), new Dell()};
        for (Computer computer : computers) {
            computer.charger();
            computer.repair();
            computer.expense();
            System.out.println("++++++++++++++++++++++++++++++");
        }
    }
}

class Computer {
    int year;
    int gb;

    void charger() {
        System.out.println("You do not need a special charger");
    }

    void repair() {
        System.out.println("You do not need a specialist to fix");
    }

    void expense() {
        System.out.println("The expense is not too bad");
    }
}

class Apple extends Computer {
    void charger() {
        System.out.println("You need a special charger");
    }

    void repair() {
        System.out.println("You need a specialist to fix");
    }

    void expense() {
        System.out.println("This expense is high");
    }
}

class Lenovo extends Computer {
    void expense() {
        System.out.println("The expense can be high");
    }
}

class HP extends Computer {

}

class Dell extends Computer {

}
