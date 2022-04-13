package com.syntax.class28_ARRAYLIST_and_SETS;

import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("z");
        fruit.add("a");
        fruit.add("b");
        fruit.add("g");
        fruit.add("d");
        fruit.add("z");

        System.out.println(fruit);
    }
}
