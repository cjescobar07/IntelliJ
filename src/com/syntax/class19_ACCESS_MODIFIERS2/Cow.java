package com.syntax.class19_ACCESS_MODIFIERS2;

public class Cow {
    /*
    the constructor that is provided automatically when we don't create any constructors
    in a class is called default constructor
     */
    static int numberOfLegs = 4;
    /*
    when we don't assign values to the instance fields,
    Java assigns default values to these fields:

    int = 0; default value
    double = 0.0; default value
    class objects with null; default value
    boolean with false; default value
    char \u0000; default value
     */

    private String name;
    int age;
    double weight;
    String breed;
    char gender;

    /*
    below is zero argument of no argument constructor
     */
    Cow(){
      /*
      you might want to execute code to setup the resources for your class like opening
      the connections to database, such as check the internet if it is available
      or now.
       */

    }
    void printName(){
        // int name;
        System.out.println(gender);
    }

}
