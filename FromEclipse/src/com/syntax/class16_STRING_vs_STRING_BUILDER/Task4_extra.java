package com.syntax.class16_STRING_vs_STRING_BUILDER;

public class Task4_extra {
    public static void main(String[] args) {
        /*
        get the words from the syntax
        reverse the words
        append the words to get the sentence back
         */
        String s="Sunday is great";
        String [] strArray=s.split(" ");
        for (int i = 0; i < strArray.length ; i++) {
            System.out.println(strArray[i]);
        }


    }
}
