package com.syntax.class29_MAP_INTRO;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String > names=new ArrayList<>();
        names.add("Asghar Nazir");
        names.add("Muhammad");
        System.out.println(names.get(0));

        HashMap<Integer,String> map=new HashMap<>();
        map.put(123456789,"Asghar Nazir");
        map.put(123456,"Muhammad");
        System.out.println(map.get(123456789));

        HashMap<String,String> groceries=new HashMap<>();
        groceries.put("Lilly","Eggs, milk, Bread etc");
        groceries.put("Teyfur","Eggs, milk, Bread etc");
        groceries.put("Asghar","MacBook, Iphone 13, Apple Monitor Stand for 1000$ etc");
        System.out.println(groceries.get("Lilly"));
    }
}
