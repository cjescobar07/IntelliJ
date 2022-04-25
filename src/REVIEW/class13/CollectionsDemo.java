package REVIEW.class13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<LinkedList<String>> complexData = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Chris");
        linkedList.add("Jacob");
        linkedList.add("Sebastian");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Person1");
        linkedList2.add("Person2");
        linkedList2.add("Person3");

        complexData.add(linkedList);
        complexData.add(linkedList2);
        System.out.println(complexData);

    }
}
