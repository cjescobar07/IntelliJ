package com.syntax.class21_INHERITANCE1;

class Child extends com.syntax.class21_INHERITANCE1.Parent {
    String color = "Red";

    void printInfo() {

        System.out.println("I am your child");
    }

    void print() {
        printInfo();

    }

    void printColor() {
        String color = "Green";
        // refers to local variable
        System.out.println(color);
        // refers to instance variable
        System.out.println(this.color);
        // refers to parent variable
        System.out.println(super.color);
    }

}
