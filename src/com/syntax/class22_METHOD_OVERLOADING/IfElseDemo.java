package com.syntax.class22_METHOD_OVERLOADING;

public class IfElseDemo {
    public static void main(String[] args) {

    int number = 10;
    /*
    The ternary operator has the limitations that it must return something. We can't use it to print things
     */
    // number>10?System.out.println("Number is greater"):System.out.println("Number is smaller")

    }
    int maxNumber(int num1, int num2){
        /*if(num1>num2){
            return num1;
        }else{
            return num2;
        }*/
        return num1>num2?num1:num2;
        // int manNUm =  num1>num2?num1:num2;
        // num1>num ==> the condition part
        // return manNum;
    }
}
