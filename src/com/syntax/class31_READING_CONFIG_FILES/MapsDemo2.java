package com.syntax.class31_READING_CONFIG_FILES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

            ArrayList<String> vegetables = new ArrayList<>();
            vegetables.add("Potato");
            vegetables.add("Carrot");
            vegetables.add("Onion");

            ArrayList<String> fruit = new ArrayList<>();
            fruit.add("Apple");
            fruit.add("Orange");
            fruit.add("Banana");

        Map<String,ArrayList<String>> healthyFoods = new HashMap<>();
        healthyFoods.put("Vegetables", vegetables);
        healthyFoods.put("Fruit", fruit);

        System.out.println(healthyFoods);
        }
    }

