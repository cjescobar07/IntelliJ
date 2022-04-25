package com.syntax.class33_EXCEPTION_FINAL_BLOCK_FINALLY_THROWS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Task {
    /**
        How would handle InputMismatchException? Input Mismatch Exception when user
        enters mismatch value then programmer expected.

        Create a static method that will return a List of Exceptions.
        Inside your method create objects of 4 exception classes using
        try and catch blocks and store them inside your list.
        Call your method inside main and print name and details of all Exception objects.
     */
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner((System.in));
            System.out.println(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter the correct type of data");
        }
    }
}
