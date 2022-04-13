package com.syntax.class20_INHERITANCE;

public class Parent {
    private String name; // private members don't participate in inheritance
    int age;
    protected double weight;
    public String color;
}
class Child extends Parent{
 void printInfo(){
    // System.out.println(name);
     System.out.println(age);
     System.out.println(weight);
     System.out.println(color);
  }
}