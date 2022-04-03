package com.syntax.class27_ARRAYLIST;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");
        itemsToBeRemoved.add("Pillow");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);

    }
}
