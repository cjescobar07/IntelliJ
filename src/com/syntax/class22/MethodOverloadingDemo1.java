package com.syntax.class22;

public class MethodOverloadingDemo1 {
    public static void main(String[] args) {
        add(10);
        add(10,10);
        add(10,20,30,45,586);
    }

   /* static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }*/
    static void add(int ...numArray){
       int sum = 0;
       for (int num:numArray){
           sum = sum+num;
       }
        System.out.println(sum);
    }
}
