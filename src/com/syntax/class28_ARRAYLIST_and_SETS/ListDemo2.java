package com.syntax.class28_ARRAYLIST_and_SETS;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        courses.add("TestNg");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interview");
        courses.add("Resume");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");
        System.out.println(courses);

        courses.set(courses.size()-1, "Happy"); // set is also known as replace
        System.out.println(courses);

        courses.set(3, "Git Bash"); // set is also known as replace
        System.out.println(courses);

        /*courses.set(courses.indexOf("Dead"), "Happy"); // set is also known as replace
        System.out.println(courses);*/


    }
}
