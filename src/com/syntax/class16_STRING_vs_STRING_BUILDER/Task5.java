package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class Task5 {
    public static void main(String[] args){
        // How would you check if String is palindrome or not? aba=> true
        // Example1: aba ---> true aba
        // Example2: Abbc ---> false cbbA
        Task5 task = new Task5();
        System.out.println(task.isPalindrome("aba")); // true
        System.out.println(task.isPalindrome("Abbc")); // false
    }
    boolean isPalindrome(String inputStr){
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }
    String reverseString(String inputString) {
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

      }
    }
