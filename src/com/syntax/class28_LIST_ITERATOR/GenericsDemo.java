package com.syntax.class28_LIST_ITERATOR;

public class GenericsDemo {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        add(10.5,10.2);
    }
}
