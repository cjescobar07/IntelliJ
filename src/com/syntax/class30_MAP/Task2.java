package com.syntax.class30_MAP;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String,String> countries = new TreeMap<>();
        countries.put("United States","District of Columbia");
        countries.put("El Salvador", "San Salvador");
        countries.put("Dominican Republic", "Santo Domingo");
        countries.put("United Kingdom", "London");
        countries.put("Japan", "Tokyo");
        System.out.println(countries);
        System.out.println("========================================================");
        for (Map.Entry<String,String> entry : countries.entrySet()) {
            System.out.print(entry.getKey() + ":" + " ");
            System.out.println(entry.getValue());
        }
        System.out.println("========================================================");
        Iterator<Map.Entry<String,String>> iterator = countries.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry);
            // System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
        }
        System.out.println("========================================================");
        //
        for (String value : countries.values()) {
            System.out.println(value);
        }

    }
}
