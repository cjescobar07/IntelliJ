package com.syntax.class23_METHOD_OVERLOADING;

class Student{
    void study(){
        System.out.println("Students must study to pass.");
    }
    void doHomework(){

        System.out.println("Students must do homework.");
    }
    void practice(){

        System.out.println("Students must practice more.");
    }
}
class SyntaxStudent extends Student{
    void study(){

        System.out.println("Syntax students must study 25hrs a week.");
    }
    void doHomework(){

        System.out.println("Syntax students must solve Repls");
    }
    void practice(){

        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    void doHomework() {
        System.out.println("College students can skip some of the homework");
    }
}
class SchoolStudent extends Student{

}

public class Task6 {
    /*
        Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        Define common behavior within parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Write example of achieving run time polymorphism
     */
    public static void main(String[] args) {
        /* In Java, we can store the object of a child classes
           in a parent type variable
         */
        // Every class in Java can be treated as a data type
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
        /*
        as we can store the object of a child class in a parent class
        we can also create an array of the students as shown below
         */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        /*
        int[] arr = {1,2,3};
        for(int number:arr){
        System.out.println(number);
         */

        for(Student student:students){
            student.study();
            student.doHomework();
            student.practice();
        }
    }
}
