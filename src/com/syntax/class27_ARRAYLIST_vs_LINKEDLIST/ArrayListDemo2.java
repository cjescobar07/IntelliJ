package com.syntax.class27_ARRAYLIST_vs_LINKEDLIST;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.5);
        numbers.add(100.5);
        numbers.add(12.9);
        numbers.add(1.5);

        System.out.println(numbers.get(2));
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (Double number: numbers) {
            System.out.println(number);
        }
    }
}
