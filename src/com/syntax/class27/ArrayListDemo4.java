package com.syntax.class27;


import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> grocery = new ArrayList<>();
        grocery.addAll(fruits);
        grocery.addAll(vegetables);
        System.out.println(grocery);

        ArrayList<String> itemsToBeRemoved = new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");

        grocery.removeAll(itemsToBeRemoved);
        System.out.println(grocery);

        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");
        itemsToBeRemoved.add("Pillow");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);



    }
}
