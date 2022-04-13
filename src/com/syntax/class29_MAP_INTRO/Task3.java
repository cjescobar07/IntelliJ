package com.syntax.class29_MAP_INTRO;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task3 {
    /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("San Francisco");
        cities.add("New York");
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Walnut Creek");
        cities.add("Arlington");
        cities.add("Oakland");
        cities.add("Boston");
        System.out.println(cities);

        //  cities.removeIf(x -> x.startsWith("A")); // recommended
        System.out.println(cities);
        Iterator<String> iterator= cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
