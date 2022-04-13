package com.syntax.class17_TYPES_OF_VARIABLES;

public class SyntaxEmployee {
    // Create a Class called Employee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class Employee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empID;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {

        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID ="123";
        employee1.salary = 200000;
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(SyntaxEmployee.CEO);

        System.out.println("------------");

        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empID ="456";
        employee2.salary = 150000;
        System.out.println(employee2.empID);
        System.out.println(employee2.salary);
        System.out.println(SyntaxEmployee.CEO);


    }
}
