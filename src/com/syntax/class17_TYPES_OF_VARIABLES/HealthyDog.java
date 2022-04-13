package com.syntax.class17_TYPES_OF_VARIABLES;

public class HealthyDog {
    // when the information is expected to be different from object to object
    // we store that information in an instance variable

    String name; //instance
    String color; // instance
    // if we know that a value will stay the same for all the objects of a class
    // we create a static variable for that value
    static int numberOfLegs; // static
    void eats(){
        int noOfTimes =3; //local
        System.out.println(name + " eats " + noOfTimes + " times a day.");
    }

    void sleep(){
        //System.out.println(name + "sleeping" +noOfTimes); // Can access local
    }

    public static void main(String[] args){
        HealthyDog dog = new HealthyDog(); // local, it is inside the main method

        dog.name = "Scooby";
        dog.color = "Brown";
        HealthyDog.numberOfLegs = 4;
        dog.eats();

        HealthyDog dog2 = new HealthyDog();
        dog2.name = "Scrappy";
        dog2.color = "Brown";
        HealthyDog.numberOfLegs = 4;
        dog2.eats();


    }
}
