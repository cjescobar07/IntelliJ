package com.syntax.class27_ARRAYLIST_vs_LINKEDLIST;

import java.util.ArrayList;

public class ArrayList_Task1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */

        // List<String> name =  Arrays.asList("Chris", "Michelle", "Jacob", "Sebastian", "Dog"); different way

        ArrayList<String> names = new ArrayList<>();
        names.add("Chris");
        names.add("Michelle");
        names.add("Jacob");
        names.add("Sebastian");
        names.add("Dog");


        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jacob"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
