package com.syntax.class30_MAPS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    /*
        Create a map of Best Buy store.
        Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Integer,String> bestBuy = new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(7664848,"Camera");
        bestBuy.put(7875323, "Computer");
        Iterator<Map.Entry<Integer,String>> iterator = bestBuy.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
