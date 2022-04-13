package com.syntax.class20_INHERITANCE;

public class HumanTester {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Sebastian";
        System.out.println((student.name));
        student.printName();
        student.studentID = "123";
        System.out.println("------------------------------");
        Principal principal = new Principal();
        principal.name = "Chris";
        principal.printName();
        principal.specialParkingSlot = false;
        System.out.println(principal.specialParkingSlot);
    }
}
