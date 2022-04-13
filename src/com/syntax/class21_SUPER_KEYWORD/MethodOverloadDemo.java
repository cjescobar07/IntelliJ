package com.syntax.class21_SUPER_KEYWORD;

public class MethodOverloadDemo {
    static void add(int num1, int num2){
        System.out.println("M1");
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2){
        System.out.println("M2");
        System.out.println(num1+num2);
    }
    static void add(String num1, String num2) {
        System.out.println("M3");
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        add(10.0, 10.0);
        add("10","15");

    }
}
