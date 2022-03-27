package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {

        Student chris = new Student("Chris", 31, "Video games");
        Student jacob = new Student("Jacob", 12, "Video games");
        Student sebastian = new Student("Sebastian", 7, "Video games");
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(chris);
        studentLinkedList.add(jacob);
        studentLinkedList.add(sebastian);
        System.out.println(studentLinkedList);
    }

}

class Student{

    String name;
    int age;
    String hobbies;

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
