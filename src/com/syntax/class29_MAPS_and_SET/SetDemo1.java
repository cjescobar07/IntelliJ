package com.syntax.class29_MAPS_and_SET;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yoda");
        arrayList.add("Darth Vader");
        arrayList.add("Luke Skywalker");
        arrayList.add("Han Solo");
        arrayList.add("Chewbacca");
        arrayList.add("Obi-wan Kenobi");
        arrayList.add("Darth Vader");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet);

        arrayList.clear(); // removing all the original elements

        arrayList.addAll(linkedHashSet); // adds all the unique elements with the same insertion order
        System.out.println("Array");
        System.out.println(arrayList);
    }
}
