package com.syntax.class17_TYPES_OF_VARIABLES;

public class Students {
    // Create a Class called Students
    // Create three  variables  Name , ID  and  numberOfStudents
    // Create three objects of the Students Class
    // Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    // Print out total number of students

    String Name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args){
        Students student1 = new Students();
        student1.Name = "Sebastian";
        student1.ID = "2015";
        Students.numberOfStudents++;
        System.out.println("Name: " + student1.Name);
        System.out.println("ID: " + student1.ID);

        System.out.println("--------------------");

        Students student2 = new Students();
        student2.Name = "Jacob";
        student2.ID = "2009";
        Students.numberOfStudents++;
        System.out.println("Name: " + student2.Name);
        System.out.println("ID: " + student2.ID);

        System.out.println("--------------------");

        Students student3 = new Students();
        student3.Name = "Michelle";
        student3.ID = "1983";
        Students.numberOfStudents++;
        System.out.println("Name: " + student3.Name);
        System.out.println("ID: " + student3.ID);

        System.out.println("--------------------");

        System.out.println("Total number of students: " + Students.numberOfStudents);



    }
}
