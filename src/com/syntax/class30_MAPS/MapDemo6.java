package com.syntax.class30_MAPS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);
        fruitMap.keySet();

        System.out.println(fruitMap.keySet());
        System.out.println(fruitMap.values());
        System.out.println(fruitMap.entrySet());
        // getting keys and values in the form of an entry
        Iterator<Map.Entry<String,Double>> iterator = fruitMap.entrySet().iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            //System.out.println(iterator.next().getKey());
            System.out.println(iterator.next().getValue());

         /*
         for (Map.Entry<String, Double> stringDoubleEntry : fruitMap.entrySet()) {
            System.out.println(stringDoubleEntry);
          */
        }
    }
}
