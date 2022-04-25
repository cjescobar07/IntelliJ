package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            System.out.println("1");
            System.out.println(10/0);
            System.out.println("2");

        }catch (ArithmeticException are){
            //System.out.println("3");
            //are.printStackTrace();
            System.out.println(are.getMessage());
        }
        System.out.println("4");
    }
}
