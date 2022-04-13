package com.syntax.class30_MAP;

import java.util.*;

public class Task1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> buildingFloors= new LinkedHashMap<>();
        buildingFloors.put(1,"Google");
        buildingFloors.put(2,"Syntax");
        buildingFloors.put(3,"Apple");
        buildingFloors.put(4,"Samsung");
        buildingFloors.put(1,"Google");
        buildingFloors.put(6,"Hp");
        buildingFloors.put(7,"Parking Garage");


        System.out.println(buildingFloors);
        System.out.println(buildingFloors.size());
        buildingFloors.replace(4,"Facebook");
        System.out.println(buildingFloors);
        buildingFloors.remove(7,"Parking Garage");
        System.out.println(buildingFloors);

    }
}
