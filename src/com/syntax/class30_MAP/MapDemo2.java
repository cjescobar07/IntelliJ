package com.syntax.class30_MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap = new HashMap();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        Set<String> keys = fruitMap.keySet();
        System.out.println(keys);
        Iterator<String> iterator = keys.iterator();

        // keys.removeIf(s -> s.contains("e")); lambda

        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
        System.out.println(keys);
    }
}
