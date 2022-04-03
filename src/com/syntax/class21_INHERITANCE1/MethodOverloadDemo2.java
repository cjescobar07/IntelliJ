package com.syntax.class21_INHERITANCE1;

public class MethodOverloadDemo2 {

    void printInfo(String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name + " " + age + " " + weight);
    }
    void printInfo(int age, String name, double weight){
        System.out.println("M2");
        System.out.println(name + " " + age + " " + weight);
    }
    void printInfo(int age, double weight, String name){
        System.out.println("M3");
        System.out.println(name + " " + age + " " + weight);
    }
    void printInfo(double weight, int age, String name){
        System.out.println("M4");
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverloadDemo2 methodOverLoadDemo2 = new MethodOverloadDemo2();
        methodOverLoadDemo2.printInfo("Chris", 31, 300.0); // First method
        methodOverLoadDemo2.printInfo(31, "Chris", 300.0); // Second method
        methodOverLoadDemo2.printInfo(31, 300.0, "Chris"); // Third method
        methodOverLoadDemo2.printInfo(300.0, 31,"Chris"); // Fourth Method

    }
}
