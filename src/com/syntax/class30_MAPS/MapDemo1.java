package com.syntax.class30_MAPS;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap = new HashMap();
        // fruitMap.put("Apple", 20.0); auto casting does not work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);
        fruitMap.put("Banana", 12.5); // duplicate values are overwritten by the value of the duplicate key
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("KiwI")); // case sensitive, will get "null" value as output

        fruitMap.remove("Mango"); // removes the key "Mango"
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi")); // true
        System.out.println(fruitMap.containsKey("Strawberry")); // false
        System.out.println(fruitMap.containsValue(20.0)); // true
        System.out.println(fruitMap.containsValue(55.0)); // false
        System.out.println(fruitMap.isEmpty()); // false
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana", 50.0); // changes the value of the original
        System.out.println(fruitMap);




    }
}
