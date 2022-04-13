package com.syntax.class20_INHERITANCE;

public class Lion extends Animal{

    boolean huntsOthers = true;

    void roar(){
        System.out.println(name + " is roaring");
        System.out.println(name + " is " + color);
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name = "Mufasa";
        lion.color = "Brown";
        lion.sleep();
        lion.roar();
        lion.eat();

    }
}
