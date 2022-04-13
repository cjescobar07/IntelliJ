package com.syntax.class31_READING_CONFIG_FILES;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple", 10.0);
        fruit.put("Orange", 15.0);

        HashMap<String,Double> vegeta = new HashMap<>();
        vegeta.put("Onion", 12.5);
        vegeta.put("Carrot", 10.6);

        ArrayList<HashMap<String,Double>> list = new ArrayList<>();
        list.add(fruit);
        list.add(vegeta);

        System.out.println(list);

    }
}
