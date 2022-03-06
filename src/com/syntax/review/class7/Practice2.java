package com.syntax.review.class7;

public class Practice2 {

    // Writing method in the class to return record
    String getRecord(){
      String department = "QA";
      String empName = "Chris";
      String details = "Worker " + empName + " belongs to " + department;
      System.out.println(details);
      return details;
    }

    public static void main(String[] args) {
        // creating an object of class
        Practice2 p = new Practice2();
        p.getRecord();

    }
}
