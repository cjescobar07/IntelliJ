package com.syntax.class23_METHOD_OVERLOADING;

public class StaticDemo {

}

class Cat{
    static int noOfLegs = 4;
    String name;
    Cat(String name){
        this.name = name;
    }

    public void prinInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void Print(){
        // We cannot access the instance fields directly inside static methods
        // System.out.println(name+noOfLegs);
        // We can't use instance field with static methods
        System.out.println(noOfLegs);
        // System.out.println(name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Stella");

        Cat.Print();
        Cat cat2 = new Cat("Neutella");
        Cat.Print();
    }

}