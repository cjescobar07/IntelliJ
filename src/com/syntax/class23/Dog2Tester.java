package com.syntax.class23;

public class Dog2Tester {
    public static void main(String[] args) {

    Dog2 dog = new Dog2();
    System.out.println(dog);

    Dog2 dog2 = new Dog2("Tommy", "Brown and White", "Bulldog", 12, 25.5);
    dog2.changeInfo("Rocky", "Black and White", "Husky");
        System.out.println(dog2);
   }
}
