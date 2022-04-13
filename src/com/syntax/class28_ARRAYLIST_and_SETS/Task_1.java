package com.syntax.class28_ARRAYLIST_and_SETS;


import java.util.ArrayList;
import java.util.Iterator;

public class Task_1 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Kia");
        cars.add("Nissan");
        cars.add("Lexus");
        System.out.println(cars);
        System.out.println("---------------------");

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("---------------------");
        int i = 0;
        while (i < cars.size()) {
            System.out.println(cars.get(i));
            i++;
        }
        System.out.println("---------------------");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
