package com.syntax.class30_MAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        int [] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        List<Integer> list = Arrays.asList(10,20,30);
        System.out.println(list);
        // list.add(40); it is not supported if we create lists using Arrays.asList

        List<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30));
        list2.add(40);
        System.out.println(list2);



    }
}
