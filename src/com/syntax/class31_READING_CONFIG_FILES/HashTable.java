package com.syntax.class31_READING_CONFIG_FILES;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String,String> students = new Hashtable<>();
        students.put("1", "Chris(Chris says Hi)");
        students.put("2", "Michelle");
        students.put("3", "Jacob");
        students.put("4", "Sebastian");
        students.put("5", "Dog(Dog Barks)");

        Set<Map.Entry<String,String>> entrySet = students.entrySet();
        for (Map.Entry<String,String> entry : entrySet) {

            System.out.println(entry);
        }






    }
}
