package com.syntax.class31_READING_CONFIG_FILES;

import java.util.LinkedHashSet;

public class Task2 {
        public static void main(String[] args) {
            /*  Create the collection that will store single unique Objects of a String type
                in which order is preserved.
                Write a logic to concatenate all string from the collection.
             */

            LinkedHashSet<String> drinks=new LinkedHashSet<>();
            drinks.add("Coke(Diet)");
            drinks.add("Vodka(Astaffirullah)");
            drinks.add("tequila(Astaffirullah)");
            drinks.add("margarita(Astaffirullah)");
            drinks.add("Link");
            StringBuilder allDrinks= new StringBuilder();
            for (String drink:drinks
            ) {
                allDrinks.append(drink).append(" ");
            }
            System.out.println(allDrinks);

        }
    }

