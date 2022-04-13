package com.syntax.class23_METHOD_OVERRIDING;

public class Task2 {
    /* Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method
       with specific arguments and observe result.
     */
    public static void method(String name){
        System.out.println("1");
    }
    public static void method(boolean bol){
        System.out.println("2");
    }
    public static void method(int number){
        System.out.println("3");
    }

    public static void main(String[] args) {
        method("Chris");
        method(true);
        method(31);
    }
}
