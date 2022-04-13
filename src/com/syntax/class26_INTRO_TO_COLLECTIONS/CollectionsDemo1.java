package com.syntax.class26_INTRO_TO_COLLECTIONS;

import java.util.ArrayList;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name = "Chris";
        String name2 = "Escobar";
        // Not scalable if we have to store large amount of data.
        // Arrays can be a useful option to tackle this problem

        String[] names = {"Chris", "Sebastian"};
        // names[2] = "Jacob";
        String[] names2 = new String[1000];
        names2[0] = "Michelle";
        names2[2] = "Dog";
        //System.out.println(Arrays.toString(names2));

        ArrayList<String> syntaxStudents = new ArrayList<>();
        // ArrayList --> Name of the class
        // <> diamond operator
        // Sting datatype
        syntaxStudents.add("Scooby");
        syntaxStudents.add("Jordan");
        syntaxStudents.add("Scrappy");
        System.out.println(syntaxStudents);
    }
}
