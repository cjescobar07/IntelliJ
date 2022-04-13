package com.syntax.class30_MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap = new HashMap();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);

        Collection<Double> values = fruitMap.values();
        System.out.println(values);

        // values.removeIf(aDouble -> aDouble >= 20); lambda

        Iterator<Double> iterator = values.iterator();
        while(iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
