package com.syntax.class27_ARRAYLIST_vs_LINKEDLIST;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Boolean> flags = new ArrayList<>();
        flags.add(true);
        flags.add(true);
        flags.add(false);
        flags.add(true);

        System.out.println(flags.contains(false));
        System.out.println(flags.contains(true));
    }
}
