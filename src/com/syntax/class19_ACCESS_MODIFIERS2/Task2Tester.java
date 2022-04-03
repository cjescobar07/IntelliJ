package com.syntax.class19_ACCESS_MODIFIERS2;

public class Task2Tester {
    public static void main(String[] args) {

    Task2 student = new Task2("Chris", 95, 96, 92);
    student.printAvgGrade();

    new Task2("Chris",97,93, 91).printAvgGrade();
  }
}
