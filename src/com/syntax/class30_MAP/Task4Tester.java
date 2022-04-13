package com.syntax.class30_MAP;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put("a", new Person("Safiul","Alam",42,1500000));
        personTreeMap.put("b", new Person("Gulden","A",16,1400000));
        personTreeMap.put("c", new Person("Mr","A",22,1700000));
        personTreeMap.put("d", new Person("Nassir","Ariyan",27,1800000));

        for (Map.Entry<String,Person> p:personTreeMap.entrySet()
        ) {
            System.out.println(p);
        }


    }
}