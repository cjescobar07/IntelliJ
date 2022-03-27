package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
