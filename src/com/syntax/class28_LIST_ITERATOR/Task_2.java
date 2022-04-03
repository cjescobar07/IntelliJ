package com.syntax.class28_LIST_ITERATOR;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
    /*
    Create an arrayList of words. Remove every
    word that ends with "e".
     */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Love");
        arrayList.add("lahore");
        arrayList.add("cake");

        // arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);

    }
}