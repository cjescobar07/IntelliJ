package com.syntax.class27_ARRAYLIST;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1, 100);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(1, 100);
    }
}
