package com.syntax.class19;

public class Horse {
    // It is very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

    // No argument/zero argument constructor
    //Horse() {
    /* write some important line of code that
        you want to execute when the object of a class is
        created. For example:
        you might want to fetch info from the internet or from your
        hard disk to give inital values to the fields
     */

    public Horse (String horseName, int horseAge, double horseWeight){
        this.name = horseName;
        this.age = horseAge;
        this.weight = horseWeight;
    }
    // Rule# 1 Constructors don't have return types like int String, not even void
    /* void Horse(String, horseName, int horseAge, double horseWeight){
        name = horseName;
        age = horseAge;
        weight = horseWeight;
    }
     */

    /* Rule# 2 name of the constructor should be same as name of the class
        Horse1(String, horseName, int horseAge, double horseWeight){
        name = horseName;
        age = horseAge;
        weight = horseWeight;
     }
     */
    void printHorseName(){
        System.out.println(name);
    }
    void setName(String horseName){
        name = horseName;
    }

}
