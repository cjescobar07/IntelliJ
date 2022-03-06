package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {

        /*
        get the words from the syntax
        reverse the words
        apend the words to get the sentence back
         */

        String s = "Sunday is great";
        Task4 task4 = new Task4();
        //System.out.println(task4.reverseString(s));
        String[] strArray = s.split(" ");
        //System.out.println(strArray[0]);
        for (int i = 0; i<strArray.length; i++){
            // strArray[i] = task4.reverseString(strArray[i]);
            System.out.print(task4.reverseString(strArray[i])+" ");
        }
    }
        String reverseString(String inputString) {
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();


    }

}